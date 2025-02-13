import java.util.Scanner;
import java.util.Stack;

public class texteditor {
    
    static class CustomStack {
        private StringBuilder text;
        private Stack<String> history; // Stack to store the history for undo operations

        public CustomStack() {
            text = new StringBuilder(); // Initial text is empty
            history = new Stack<>();
        }

        // Insert a string at the current cursor position
        public void insert(String value) {
            // Save the current state before making changes
            history.push(text.toString());
            // Append the new string
            text.append(value);
        }

        // Delete the last 'value' characters from the text
        public void delete(int value) {
            // Save the current state before making changes
            history.push(text.toString());
            // Remove the last 'value' characters
            int length = text.length();
            if (length >= value) {
                text.delete(length - value, length);
            }
        }

        // Get the character at the specified index
        public char get(int index) {
            // Since the editor is 1-based and StringBuilder is 0-based, subtract 1 from index
            return text.charAt(index - 1);
        }

        // Undo the last operation
        public void undo() {
            // Revert to the last saved state
            if (!history.isEmpty()) {
                text = new StringBuilder(history.pop());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomStack editor = new CustomStack();

        // Input: a sequence of commands separated by commas
        String input = scanner.nextLine();
        String[] commands = input.split(",");

        for (String command : commands) {
            String[] parts = command.trim().split(" ");
            int cmd = Integer.parseInt(parts[0]);

            switch (cmd) {
                case 1: // Insert
                    editor.insert(parts[1]);
                    break;
                case 2: // Delete
                    editor.delete(Integer.parseInt(parts[1]));
                    break;
                case 3: // Get
                    int index = Integer.parseInt(parts[1]);
                    System.out.println(editor.get(index));
                    break;
                case 4: // Undo
                    editor.undo();
                    break;
            }
        }

        scanner.close();
    }
}

/* 
Create a text editor using commands
You are developing a text editor that allows users to perform various operations on the text using the "CustomStack" class. The class supports the following operations:

insert(value): Inserts a string of characters at the current cursor position in the text.
delete(value): Deletes the last value characters from the text starting from the current cursor position.
get(value): Retrieves the character at index value from the text and displays it.
undo(): Reverts the last executed command on the text.
Each command is represented by a string in the following format:

1.Command 1: '1 value' - Inserts the string value at the current cursor position in the text.
2.Command 2: '2 value' - Deletes the last value characters from the text starting from the current cursor position.
3.Command 3: '3 value' - Retrieves the character at index value from the text and displays it.
4.Command 4: '4' - Reverts the last executed command on the text.

Consider a scenario where you have a text editor with a "CustomStack" class that implements the required operations. Assume the initial text is empty.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1
input:
1 abc,3 3,2 2,3 1

Here
1 abc -> command and input text
3 3 -> command and index of the stack
Output:
c
a

Exercise-2
Input:

1 zxy,3 3,2 2,1 def,3 2

Output:
y
d
*/