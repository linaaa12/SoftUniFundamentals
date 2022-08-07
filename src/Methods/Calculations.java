package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Въвежда се стринг
        String operation = scanner.nextLine();
        //Въвежда се 1-во число
        int firstNumber = Integer.parseInt(scanner.nextLine());
        //Въвежда се 2-ро число
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (operation){
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "multiply":
                multiply(firstNumber, secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "divide":
                divide(firstNumber, secondNumber);
                break;
        }

    }

    //метод за събиране
    public static void add (int numOne, int numTwo){
        System.out.printf("%d", numOne + numTwo);
    }

    //метод за умножение
    public static void multiply(int numOne, int numTwo){
        System.out.printf("%d", numOne * numTwo);
    }

    //метод за изваждане
    public static void subtract(int numOne, int numTwo){
        System.out.printf("%d", numOne - numTwo);
    }


    //метод за деление
    public static void divide(int numOne, int numTwo){
        System.out.printf("%d", numOne / numTwo);
    }
}
