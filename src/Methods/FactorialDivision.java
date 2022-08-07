package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        long resultFirst = calculateFactorial(numberOne);
        long resultSecond = calculateFactorial(numberTwo);
        System.out.printf("%.2f", resultFirst * 1.0 / resultSecond);
    }

    public static long calculateFactorial(long number){
        long result = 1;
        for(int i = 1; i <= number; i++){
            result = result * i;
        }
        return result;
    }

}
