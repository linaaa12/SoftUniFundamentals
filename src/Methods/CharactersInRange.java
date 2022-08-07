package Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //въвеждат се 2 букви
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        printBetweenCharacters((int) firstChar, (int) secondChar);
    }

    //да се принтират всички букви между тях
    public static void printBetweenCharacters(int one, int two){
        int newInt = 0;
        if(one > two){
            newInt = one; //67
            one = two; //35
            two = newInt; //67
        }
        for(int i = one + 1; i < two; i++){
            if(one < two) {
                System.out.print((char) i + " ");
            }
        }
    }
}
