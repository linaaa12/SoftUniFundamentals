package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input =scanner.nextLine();
            String [] inputArray = input.split(" ");
            int [] arrayA = Arrays
                    .stream(inputArray)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Arrays.sort(arrayA);

        System.out.printf("%s", Arrays.toString(arrayA));
    }
}
