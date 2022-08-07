package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вкарват се данните от конзолата
        String firstValues = scanner.nextLine();
        String secondValues = scanner.nextLine();

        //Вкарват се данните от конзолата в масив, като се премахват празните места
        String [] firstArray = firstValues.split(" ");
        String [] secondArray = secondValues.split(" ");


        //Вземи ми елемнта на следната позиция от втория масив
        for(int i = 0; i < secondArray.length; i++){
            //запази ми данните на елемента на тази позиция
            String firstEl = secondArray[i];

            //Вземи ми елемента на следната позиция от първия масив
            for(int j = 0; j < firstArray.length; j++ ){
                //запази ми данните на елемента на таззи позиция
                String secondEl = firstArray[j];

                //Ако данните на съответните позиции са еднакви ми ги принтирай
                if(firstEl.equals(secondEl)){
                    System.out.print(firstEl + " ");
                }
            }
        }

        System.out.println();
    }
}
