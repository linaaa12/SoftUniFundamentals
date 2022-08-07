package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrayInput = input.split(" ");
        int[] array = Arrays
                .stream(arrayInput)
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arrayLeftElements = new int[array.length];
        int sumLeft = 0;

        for (int i = 0; i < array.length; i++) {
            int currentEl = array[i];
            sumLeft = sumLeft + array[i];
            arrayLeftElements[i] = sumLeft;
        }

        int[] arrayRightElements = new int[array.length];
        arrayRightElements[0] = arrayLeftElements[array.length - 1];
        //int sumRight = 0;

        for (int j = 0; j < array.length - 1; j++) {
            int sumRight = arrayRightElements[j] - array[j];
            arrayRightElements[j + 1] = sumRight;
        }

        boolean isEqual = false;
        for (int i = 0; i < array.length; i++) {
            int currLeftEl = arrayLeftElements[i];
            int currRightEl = arrayRightElements[i];

            if (currLeftEl == currRightEl) {
                isEqual= true;
                System.out.println(i);
                break;
            }else{
                isEqual = false;
            }


        }
        if(!isEqual){
            System.out.println("no");
        }
    }
}
