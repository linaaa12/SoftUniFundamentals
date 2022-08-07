package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class EvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //въвеждаме числото
        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        int evenDigit = evenDigitSum(number);
        int oddDigit = oddDigitSum(number);
        System.out.println(evenDigit * oddDigit);
    }

    //метод който намира четните числа
    public static int evenDigitSum(int number){
        String intToString = Integer.toString(number);

        int [] array = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();


        int sumEven = 0;

        for(int i = 0; i < array.length; i++){
            int currentNum = array[i];

            if(currentNum % 2 == 0){
                sumEven = sumEven + currentNum;
            }
        }

        return sumEven;

    }

    //метод който намира нечетните числа
    public static int oddDigitSum(int number){
        String intToString = Integer.toString(number);

        int [] array = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();


        int sumOdd = 0;

        for(int i = 0; i < array.length; i++){
            int currentElement = array[i];

            if(currentElement % 2 == 1){
                sumOdd = sumOdd + currentElement;
            }
        }

        return sumOdd;
    }

}
