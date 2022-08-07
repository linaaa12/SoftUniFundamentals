package Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        int n = Integer.parseInt(scanner.nextLine());

        //Два нови масива, в които ше съхранявам данните
        String [] firstArr = new String[n];
        String [] secondArr = new String[n];


        //Колкото реда съм задала. толкова данни ще вкарвам
        for (int i = 0; i < n; i++){

            //Вкарвам данните и едновременно с това правя проверките
            String input = scanner.nextLine();
            String [] values  = input.split(" ");
            //Ако редът е четен -> първо число:първи масив, второ число:втори масив
            if((i) % 2 == 0){
                firstArr[i] = values[0]; //сложи ми на този индекс от масива, първото число
                secondArr[i] = values[values.length - 1];
            }else{
                firstArr[i] = values[values.length - 1];
                secondArr[i] = values[0];
            }

        }
        for (String first:firstArr) {
            System.out.print(first + " ");
        }
        System.out.println();
        for (String second:secondArr) {
            System.out.print(second + " ");
        }
    }
}
