package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLineFirst = scanner.nextLine();
        String [] firstLine = inputLineFirst.split(" ");
        int [] firstArray = Arrays
                .stream(firstLine)
                .mapToInt(Integer ::parseInt)
                .toArray();

        String inputSecondLine = scanner.nextLine();
        String [] secondLine = inputSecondLine.split(" ");
        int [] secondArray = Arrays
                .stream(secondLine)
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = Math.max(firstArray.length, secondArray.length);

        int sum = 0;
        boolean isEqual = false;

        for(int index = 0; index < maxLength; index ++){

            if(firstArray[index] == secondArray[index]){
                isEqual = true;
                sum = sum + firstArray[index];
            }else{
                isEqual = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", index);
                break;
            }
        }

        if(isEqual == true){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }



    }
}
