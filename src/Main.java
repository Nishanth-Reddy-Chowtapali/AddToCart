import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of items in your cart: ");
        int addToCart = scanner.nextInt();
        if (addToCart < 0) {                                                            // Checks for negative values
            System.out.println("please enter a positive value");
            addToCart = scanner.nextInt();
        }

        System.out.println("Please select the the option from below:-");
        System.out.println("1. Add to cart");
        System.out.println("2. Remove from cart");
        System.out.println("3. Checkout");


        int temp = scanner.nextInt();
        switch (temp) {
            case 1:
                System.out.println("please select the number of items you want to add");
                int addingItems = scanner.nextInt();
                addToCart += addingItems;
                System.out.println("Addition successful!! you have " + addToCart + " items remaining in your cart");
                break;

            case 2:
                System.out.println("please select the number of items you want to delete");
                int deletingItems = scanner.nextInt();
                if (addToCart <= 0) {                                                  //Checks whether deletingItems is < 0
                    System.out.println("Items in cart are " + addToCart + ", cannot initiate the request.");
                } else if (addToCart < deletingItems) {                                //Checks whether deletingItems is less than addToCart value
                    System.out.println("Items in cart are less than " + deletingItems + " cannot initiate the request. Please select the appropriate amount");
                } else {
                    addToCart -= deletingItems;
                    System.out.println("Deletion successful!! you have " + addToCart + " items remaining in your cart");
                }
                break;

            case 3:
                System.out.println("Thank you for shopping with us. You have checked out with " + addToCart + " items in your cart. Happy Shopping!!!!");
                break;
        }

    }
}
