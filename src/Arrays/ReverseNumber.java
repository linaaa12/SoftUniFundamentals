package Arrays;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Колко числа ще се четат
        int n = Integer.parseInt(scanner.nextLine());

        //Създадох си масив, който е празен
        int [] integersArr = new int[n];

        //Създаваме цикъл, с който ще въвеждаме числата до n
        for (int i = 0; i < n; i++) {
            //На този индекс ми сложи числото, което ще ти подам
            integersArr[i] = Integer.parseInt(scanner.nextLine());
        }

//        for (int numbersNormal : integersArr) {
//            System.out.print(numbersNormal + " ");
//        }
        //За да принтираме числата в обратен ред трябва да тръгнем от най - голямото -> тръгваме отзад напред
        for (int i = integersArr.length - 1; i >= 0 ; i--){
            System.out.print(integersArr[i] + " ");
        }
    }
}
