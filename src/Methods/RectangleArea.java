package Methods;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int area = calculateRectangleArea(width, length);
        System.out.println(area);

    }

    public static int calculateRectangleArea(int a, int b){
        return a * b;
    }
}
