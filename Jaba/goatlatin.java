import java.util.Scanner;

public class goatlatin {

    // Method to check if the character is a vowel
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    // Method to convert a sentence to Goat Latin
    public static String toGoatLatin(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        // Iterate through each word
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder newWord = new StringBuilder();

            // Rule 1: If word starts with a vowel, just append "ma"
            if (isVowel(word.charAt(0))) {
                newWord.append(word).append("ma");
            } else {
                // Rule 2: If word starts with a consonant, move the first letter to the end and append "ma"
                newWord.append(word.substring(1)).append(word.charAt(0)).append("ma");
            }

            // Rule 3: Add 'a' based on the word index (i+1 because it's 1-based index)
            for (int j = 0; j <= i; j++) {
                newWord.append("a");
            }

            // Append the transformed word to the result
            result.append(newWord);
            if (i < words.length - 1) {
                result.append(" "); // Add space between words
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        String sentence = scanner.nextLine();

        // Convert the sentence to Goat Latin
        String goatLatinSentence = toGoatLatin(sentence);

        // Output the Goat Latin sentence
        System.out.println(goatLatinSentence);

        scanner.close();
    }
}

/*Goat Latin Conversion
Given a sentence, S, consisting of words separated by spaces, we want to convert it into "Goat Latin," which is a fictional language similar to Pig Latin.

The rules for Goat Latin conversion are as follows:

If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word. For example, the word 'apple' becomes 'applema'.

If a word begins with a consonant (a letter that is not a vowel), remove the first letter, append it to the end of the word, and then add "ma". For example, the word "goat" becomes "oatgma".

Add one letter 'a' to the end of each word based on its word index in the sentence, starting with 1. For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.

Write a program that takes the sentence S as input and returns the final sentence representing its conversion into Goat Latin.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise 1:

Input:
aasssdd

Output:
aasssddmaa

Exercise 2:

Input:
I speak Goat Latin

Output:
Imaa peaksmaaa oatGmaaaa atinLmaaaaa */
