package Methods;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //въвежда се стринг
        String input = scanner.nextLine();
        String [] array = input.split("");
        int count = countOfVowels(array);
        System.out.println(count);
    }

    //метод, който връща броя гласни -> int
    public static int countOfVowels(String [] array){
        int countVowels = 0;
        // a, e, i, o, u
        for(int i = 0; i < array.length; i++){
            String currentEl = array[i].toLowerCase(Locale.ROOT);
            if(currentEl.equals("a") || currentEl.equals("e") || currentEl.equals("i") || currentEl.equals("o") || currentEl.equals("u")){
                countVowels++;
            }
        }
        return countVowels;
    }
}
