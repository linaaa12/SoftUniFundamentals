package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printMiddleCharacter(input);
    }

    //Метод, който принтира средната буква от стринга
    //Ако дължината е четна -> принтира една буква
    //Ако дължината е нечетна -> принтира 2 букви

    public static void printMiddleCharacter(String input){
        int length = input.length();
        //Ако дължината е нечетна -> 7 / 2 = 3
        if(length % 2 == 1){
            System.out.println(input.charAt(length / 2));
        }else{
            System.out.print(input.charAt((length / 2) - 1) + "" + input.charAt(length / 2 ));
        }
    }
}
