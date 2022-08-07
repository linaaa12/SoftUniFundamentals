package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int[] array = Arrays
                .stream(inputArr)
                .mapToInt(Integer::parseInt)
                .toArray();


        int count = 0;
        int maxCount = Integer.MIN_VALUE;
        int maxNum = 0;


        for (int i = 0; i < array.length - 1; i++) {
            int currentElement = array[i];

            //Ако двете числа са равни
            if (array[i] == array[i + 1]) {

                //запомни колко пъти го срещна
                count++;

                //Ако ти го срещна повече пъти от колкото е най-голямото, кажи на най - голямото да приеме твоята стойност
                if (count > maxCount) {
                        maxCount = count;

                    //запомни текущото число
                        maxNum = currentElement;
                }

                //Ако числата не са равни моля те нека пак е нула и започнем да търсим друг
            } else {
                count = 0;
            }

        }

        for (int i = 0; i <= maxCount; i++) {
            System.out.print(maxNum + " ");
        }
    }
}

