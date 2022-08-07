package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Въвеждаме числата като стринг
        String input = scanner.nextLine();

        String [] arrayInput = input.split(" "); //Слагаме ги в масив, като взимаме само числата без празните места

        //От String към Int
        int [] array = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isTop = false;

        //С този масив ще обхождаме всички числа от масива
        // 1 4 3 2
        // 0 1 2 3 - започни от 0 и като стигнеш до предполседния елемент СПРИ, защото последния винагие ТОП
        for(int i = 0; i < array.length - 1; i++){
            int topEl = array[i];

            //Обхождам масива от следващия елемент нататък
            for(int j = i + 1; j < array.length; j++){
                int currentEl = array[j];

                //Ако това е така развявам флага
                if(topEl > currentEl){
                    isTop = true;
                //Ако това не е така пак развявам флага и прекъсвам цикъла
                //защото щом не е изпъленено условието за едно от числата, то не важи и за другите
                }else{
                    isTop = false;
                    break;
                }
            }
            if(isTop){
                System.out.print(topEl + " ");
            }
        }
        System.out.println(array[array.length - 1]);
    }
}
