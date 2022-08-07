package DSS;

import java.util.Arrays;
import java.util.Scanner;

public class RelativeSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLineFirst = scanner.nextLine();
        String [] firstLine = inputLineFirst.split(" ");
        int [] arr1 = Arrays
                .stream(firstLine)
                .mapToInt(Integer ::parseInt)
                .toArray();

        String inputSecondLine = scanner.nextLine();
        String [] secondLine = inputSecondLine.split(" ");
        int [] arr2 = Arrays
                .stream(secondLine)
                .mapToInt(Integer::parseInt)
                .toArray();

        arr1 = relativeSortArray(arr1, arr2);
        for (int j : arr1) {
            System.out.print(j + " ");
        }
    }

    public static int[] relativeSortArray(int [] arr1, int [] arr2)
    {
        int [] counterArr = new int[1001];

        for(int a: arr1){
            counterArr [a] ++;
        }

        int positionOfArr1 = 0;
        for(int a: arr2) {
            while (counterArr[a] > 0) {
                arr1[positionOfArr1++] = a;
                counterArr[a]--;
            }
        }

        for(int i = 0; i < 1001; i++) {
            while (counterArr[i] > 0) {
                arr1[positionOfArr1++] = i;
                counterArr[i]--;
            }
        }

        return arr1;
    }
}
