package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Въвеждам 3 числа
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int sum = sumFirstAndSecond(firstNum, secondNum);
        int subtract = subtractThird(firstNum, secondNum, thirdNum);
        System.out.println(subtract);

    }

    //Метод, който да събира първите две числа и да връща резултата
    public static int sumFirstAndSecond(int a, int b){
        return a + b;
    }
    //Метод, който да намира разликата на първите две числа с третото
    public static int subtractThird(int a, int b, int c){
        int sum = sumFirstAndSecond(a, b);
        return sum - c;
    }

}
