package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //въвеждаме стринг
        String input = scanner.nextLine();
        //въвеждаме колко пъти ще се повтори стринга
        int n = Integer.parseInt(scanner.nextLine());
        String result = concatenateStrings(input, n);
        System.out.println(result);

    }

    //метод, който връща n пъти даден стринг
    public static String concatenateStrings(String input, int n){
        String newInput = "";
        for(int i = 1; i <= n; i++){
            newInput = newInput + input;
        }
        return newInput;
    }
}
