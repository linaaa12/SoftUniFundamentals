package Arrays;

import java.util.Scanner;

public class ReverseArrayString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Въвеждане на стринг
        String input = scanner.nextLine();

        //2. Данните от стринга да влезнат, като се отстранят разстоянията
        String [] array = input.split(",");

        for (int index = 0; index < array.length / 2; index++) {

            //Взима стойността на текущия индекс
            String oldElement = array[index];

            //За текущия индекс да се присвоява нова стойност
            array[index] = array[array.length - 1 - index];

            //А накрая на масива да се записва старата стойност на текущата позиция
            array[array.length - 1 - index] = oldElement;
        }

        for (String letter:array) {
            System.out.print(letter + " ");
        }
    }
}
