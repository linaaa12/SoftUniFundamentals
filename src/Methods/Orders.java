package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //въвежда се продукта: кафе, вода, кола, снакс
        String order = scanner.nextLine();
        //въвежда се количеството на съответния продукт
        int quantity = Integer.parseInt(scanner.nextLine());

        double totalPrice = calculatePrice(order, quantity);
        System.out.printf("%.2f", totalPrice);

    }

    public static double calculatePrice(String order, int quantity){

        double totalPrice = 0;
        switch (order){
            case "coffee":
                totalPrice =  quantity * 1.50;
                break;
            case "water":
                totalPrice =  quantity * 1.00;
                break;
            case "coke":
                totalPrice = quantity * 1.40;
                break;
            case "snacks":
                totalPrice =  quantity * 2.00;
                break;
        }
        return totalPrice;
    }

}
