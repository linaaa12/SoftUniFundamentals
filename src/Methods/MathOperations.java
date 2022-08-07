package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        double calculate = calculate(firstNum, operation, secondNum);
        System.out.println(new DecimalFormat("0.##").format(calculate));


    }

    public static double calculate (int numOne, String operation, int numTwo){

        double result = 0.0;

        switch (operation){
            case "*":
                result = numOne * numTwo;
                break;
            case "+":
                result = numOne + numTwo;
                break;
            case "/":
                result = numOne * 1.0 / numTwo;
                break;
            case "-":
                result = numOne - numTwo;
                break;

        }
        return result;
    }
}
