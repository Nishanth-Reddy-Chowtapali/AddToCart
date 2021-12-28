import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of items in your cart: ");
        int value = scanner.nextInt();
        if(value < 0){
            System.out.println("please enter a positive value");
            value = scanner.nextInt();
        }else{

        }

        System.out.println("Please select the the option from below:-");
        System.out.println("1. Add to cart");
        System.out.println("2. Remove from cart");
        System.out.println("3. Checkout");



        int temp = scanner.nextInt();
        switch(temp){
            case 1: System.out.println("please select the number of items you want to add");
                int addingItems = scanner.nextInt();
                value += addingItems;
                System.out.println("Addition successful!! you have " + value + " items remaining in your cart");
                break;

            case 2: System.out.println("please select the number of items you want to delete");
                int deletingItems = scanner.nextInt();
                if(value <= 0) {
                    System.out.println("Items in cart are " + value + ", cannot initiate the request." );
                }else if(value < deletingItems){
                    System.out.println("Items in cart are less than " +deletingItems + " cannot initiate the request. Please select the appropriate amount");
                }else{
                        value -= deletingItems;
                        System.out.println("Deletion successful!! you have " + value + " items remaining in your cart");
                }

                break;
            case 3:
                System.out.println("Thank you for shopping with us. You have checked out with " +value + " items in your cart. Happy Shopping!!!!");
                break;
        }

    }
}
