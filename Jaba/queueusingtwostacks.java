import java.util.Scanner;
import java.util.Stack;

public class queueusingtwostacks {

    static class CustomQueue {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public CustomQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        // Enqueue operation: Insert element at the end of the queue
        public void enqueue(int x) {
            stack1.push(x);
        }

        // Dequeue operation: Remove the element from the front of the queue
        public void dequeue() {
            if (stack2.isEmpty()) {
                // Move all elements from stack1 to stack2
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }

        // Print the element at the front of the queue
        public void printFront() {
            if (stack2.isEmpty()) {
                // Move all elements from stack1 to stack2
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            if (!stack2.isEmpty()) {
                System.out.println(stack2.peek());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomQueue queue = new CustomQueue();

        // Input: a sequence of commands separated by commas
        String input = scanner.nextLine();
        String[] commands = input.split(",");

        for (String command : commands) {
            String[] parts = command.trim().split(" ");
            int queryType = Integer.parseInt(parts[0]);

            switch (queryType) {
                case 1: // Enqueue
                    int value = Integer.parseInt(parts[1]);
                    queue.enqueue(value);
                    break;
                case 2: // Dequeue
                    queue.dequeue();
                    break;
                case 3: // Print front
                    queue.printFront();
                    break;
            }
        }

        scanner.close();
    }
}

/*Queue
Write a program to implement a custom queue using two stacks. The queue should support the following three types of queries:
Enqueue: This query type is denoted by "1 x", where x is an element to be enqueued. It means that you need to insert element x at the end of the queue.
Dequeue: This query type is denoted by "2". It indicates that you should remove the element at the front of the queue.
Print Front: This query type is denoted by "3". It instructs you to print the element at the front of the queue without removing it.

Exercise-1
input:
1 42,2,1 14,3

output:
14

Exercise-2
input:
1 23,2,1 14,3,2,1 78,3

Output:
14
78 */
