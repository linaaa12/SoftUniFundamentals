package Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Пълним масива от стрингове ръчно
        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        // 0 -> Monday ; 1 -> Tuesday ; 2 -> Wednesday...

        //Въвеждане на деня
        int currentDay = Integer.parseInt(scanner.nextLine());

        //Ако денят ми е в интервала от 1 до 7
        if (currentDay >= 1 && currentDay <= 7) {
            //Масивът започва от 0, затова като въведем 1 -> Понеделник --> текущият ден - 1 = въведения ден
            System.out.println(days[currentDay - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
