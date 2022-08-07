package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //въвеждам число
        double number = Double.parseDouble(scanner.nextLine());
        //въвеждам степен
        int n = Integer.parseInt(scanner.nextLine());
        double result = valueOfNumber(number, n);
        //ако има след знака цифри да ги принтира до 3-тия знак, ако няма -> т.е 0, да не принтира нищо
        System.out.println(new DecimalFormat("0.####").format(valueOfNumber(number, n)));
    }

    //метод, който връща числото повдигнато на дадена степен
    public static double valueOfNumber(double number, int n){
        double result = 1;
        for(int i = 1; i <= n; i++){
            result = result * number;
        }
        return result;
    }
}
