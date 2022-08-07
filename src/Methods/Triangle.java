package Methods;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTriangle(n);
    }

    //метод, който принтира триъгълник -> извършва дейстие -> void
    public static void printTriangle(int number){
        //колкото е въведеното числото, толкова ще са редовете
        for(int i = 1; i <= number; i++){
            if(i != 1) {
                System.out.println();
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
        }
        //колкото е въведенто число, то числото - 1 = брой редове
        for(int i = number - 1; i >= 1; i--){
            System.out.println();

            // числата на един ред трябва да са толкова, колкото е броя на редовете на съответната итерация
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
        }

    }
}
