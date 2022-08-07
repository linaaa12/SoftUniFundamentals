package Methods;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }

    public static void printMatrix(int n){
        //грижи се за редовете
        for(int i = 0; i < n; i++){
            if(i != 0) {
                System.out.println();
            }
            for(int j = 1; j <= n; j++){
                System.out.print(n + " ");
            }
        }
    }
}
