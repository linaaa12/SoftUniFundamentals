package Arrays;

import java.util.Scanner;

public class SumEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четене на масив на един ред//

        //1.Прочитане на един ред входни данни
        String values = scanner.nextLine();

        //2. Създаване на масив от стрингове
        //2.1 Запазваме въведените данни от този ред в масив, като изключваме празните места
        String [] data = values.split(" ");

        //3. Създаване на масив от интове със същите данни: String -> int
        //като ще приема същата дължина
        // в момента масивът е празен
        int [] numbers = new int[data.length];


        int sum = 0;
        //4.Пълнене на масив, като парсваме към цяло число
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(data[i]);

            if(numbers[i] % 2 == 0){
                sum = sum + numbers[i];
            }
        }
        System.out.println(sum);


    }
}
