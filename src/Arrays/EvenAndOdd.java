package Arrays;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Въвеждаме стринг на един ред
        String inputLine = scanner.nextLine();

        //2. Информацията да се запише в масив, като се избегнат разстоянията
        String [] values = inputLine.split(" ");

        //3. Искаме масивът да е от интове със същата дължина
        //той е празен
        int [] numbers = new int[values.length];

        int sumEven = 0;
        int sumOdd = 0;
        //Пълним масива String -> int
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(values[i]);
            if(numbers[i] % 2 == 0){
                sumEven = sumEven + numbers[i];
            }else{
                sumOdd = sumOdd + numbers[i];
            }
        }
        int diff = sumEven - sumOdd;
        System.out.println(diff);


    }
}
