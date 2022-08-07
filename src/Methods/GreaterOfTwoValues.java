package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "int":
                int inputOne = Integer.parseInt(scanner.nextLine());
                int inputTwo = Integer.parseInt(scanner.nextLine());
                int maxNum = getMax(inputOne, inputTwo);
                System.out.println(maxNum);
                break;
            case "char":
                char inputCharOne = scanner.nextLine().charAt(0);
                char inputCharTwo = scanner.nextLine().charAt(0);
                char maxChar = getMax(inputCharOne, inputCharTwo);
                System.out.println(maxChar);
                break;
            case "string":
                String one = scanner.nextLine();
                String two = scanner.nextLine();
                String maxString = getMax(one, two);
                System.out.println(maxString);
                break;
        }

    }

    public static int getMax(int first, int second){
        int maxNum = Integer.MIN_VALUE;
        if(first > second){
            maxNum = first;
        }else if(second > first){
            maxNum = second;
        }
        return maxNum;
    }

    public static char getMax(char firstChar, char secondChar){
        //буквите се сравняват в аски код
        if(firstChar > secondChar){
            return firstChar;
        }
        return secondChar;
    }

    public static String getMax(String firstStr, String secondStr){
        //стрингове се сравняват с compareTo
        // > 0 -> str1 > str2
        // < 0 -> str1 < str2
        // == 0 -> str1 = str2
        if(firstStr.compareTo(secondStr) > 0){
            return firstStr;
        }else{
            return secondStr;
        }

    }
}
