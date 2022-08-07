package DSS;

import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String [] arrayOfWords = firstInput.split(",");

        String characters = scanner.nextLine();

        int sumOfLengths=countCharacters(arrayOfWords,characters);
        System.out.println(sumOfLengths);
    }

    public static int countCharacters(String[] words, String chars) {
        int[] counterOfCharacters = new int[26];
        int result = 0;

        for (char ch : chars.toCharArray()) {
            counterOfCharacters[ch - 'a']++;
        }

        for (String word : words) {
            int[] tempArray = counterOfCharacters.clone();
            boolean match = true;

            for (char ch : word.toCharArray()) {
                if (--tempArray[ch - 'a'] < 0) {
                    match = false;
                    break;
                }
            }

            if (match) {
                result += word.length();
            }
        }

        return result;
    }
}
