package Arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] array = input.split(" ");

        int reverseNum = Integer.parseInt(scanner.nextLine());

        //Той ще следи за пътите,в които ще се завъртят числата
        for(int i = 0; i < reverseNum; i++){

            //1. Пази стойснотта на 1-ви(нулев) елемент
            String firstElement = array[0];

            //2. Минава през целия масив, като стигнеш до предпоследния елемент -> спри
            for (int j = 0; j < array.length - 1; j++){
                //3. Нека следващият индекс да взима мястото на предходния
                array[j] = array[j+1];
            }
            //4. Когато стигнеш до последната итерация направи това
            array[array.length - 1] = firstElement;

        }
        for (String elements:array) {
            System.out.print(elements + " ");
        }
    }

}
