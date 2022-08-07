package Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //въвеждат се 3 числа
        int numFirst = Integer.parseInt(scanner.nextLine());
        int numSecond = Integer.parseInt(scanner.nextLine());
        int numThird = Integer.parseInt(scanner.nextLine());

        printTheSmallestNumber(numFirst, numSecond, numThird);
    }

    //метод, който принтира най - малкото от три числа -> void
    public static void printTheSmallestNumber(int numOne, int numTwo, int numThree){
        //int numIsSmallest = 0;
        //ако първото число е по - малко от второто и първото число е по - малко от третото -> то е най - малко
        if(numOne < numTwo && numOne < numThree){
            System.out.println(numOne);
        }else if(numTwo < numOne && numTwo < numThree){
            System.out.println(numTwo);
        }else{
            System.out.println(numThree);
        }

    }

}
