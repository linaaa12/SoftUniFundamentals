package Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int[] nums = Arrays
                .stream(array)
                .mapToInt(Integer::parseInt)
                .toArray();



        //Трябва да правим това докато в масива остане един елемент
        while (nums.length - 1 != 0) {

            //Взима дължината на nums - 1, защото [2 10 3] -> [12 13]
            int[] condensed = new int[nums.length - 1];

            //Влиза и събира числата на nums и ги пълни в масива
            for (int i = 0; i < nums.length - 1; i++) {
                condensed[i] = nums[i] + nums[i + 1];
            }

            nums = condensed;

        }

        for (int sum :nums) {
            System.out.println(sum);
        }
    }


}