package Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вагони - т.е. колко завъртания на цикъла ще имам
        int n = Integer.parseInt(scanner.nextLine());
        int [] wagonArray = new int[n];

        int sum = 0;

        for(int i = 0; i < n; i++){
            //Във всеки вагон да въвеждам пътници
            wagonArray[i] = Integer.parseInt(scanner.nextLine());
            sum = sum + wagonArray[i];
        }

        for (int train:wagonArray) {
            System.out.print(train + " ");
        }
        System.out.printf("%n%d", sum);

    }
}
