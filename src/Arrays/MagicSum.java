package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =scanner.nextLine();
        String [] inputArray = input.split(" ");
        int [] array = Arrays
                .stream(inputArray)
                .mapToInt(Integer::parseInt)
                .toArray();
        int givenNumber = Integer.parseInt(scanner.nextLine());

        //int sum = 0;

        for(int i = 0; i < array.length; i++){
            int currentFirstNum = array[i];
            for(int j = i + 1; j < array.length; j++){
                int currentSecondNum = array[j];

                int sum = currentFirstNum + currentSecondNum;
                if(sum == givenNumber){
                    System.out.print(currentFirstNum + " " + currentSecondNum);
                    System.out.println();

                }else{
                    sum = 0;
                }
            }
        }


    }
}
