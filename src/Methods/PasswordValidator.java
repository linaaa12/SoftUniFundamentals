package Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //въвеждане на паролата като стринг
        String password = scanner.nextLine();

        boolean isValidLength = checkLength(password);
        boolean isValidContent = checkContent(password);
        boolean isValidDigit = checkDigit(password);
        if(isValidLength && isValidContent && isValidDigit){
            System.out.println("Password is valid");
        }

    }

    //метод за валидиране на дължината -> от 6 до 10 символа включително
    public static boolean checkLength(String pass) {
        //boolean isValid = false;
        int length = pass.length();
        if (length < 6 || length > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }
    //метод за валидиране на съдържанието -> само букви и цифри
    public static boolean checkContent(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            //Взима буквата на този индекс
            char character = pass.charAt(i);
            if (!Character.isLetterOrDigit(character)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    //метод за валидиране на цифрите -> най - малко 2 цифри
    public static boolean checkDigit(String pass){
        int counter = 0;
        for(int i = 0; i < pass.length(); i++){
            char currentDigit = pass.charAt(i);
            if(Character.isDigit(currentDigit)){
                counter++;
            }
        }
        if(counter < 2){
            System.out.println("Password must have at least 2 digits");
            return false;
        }
        return true;
    }
}
