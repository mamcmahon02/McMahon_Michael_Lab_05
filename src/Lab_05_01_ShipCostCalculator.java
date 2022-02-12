public class Lab_05_01_ShipCostCalculator {

    public static void main(String[] args) {
	    double itemPrice = 98;
        double totalPrice;
        if (itemPrice > 100)
        {
         totalPrice = itemPrice;
        }
        else
        {
          totalPrice = itemPrice +(0.02 * itemPrice);
        }
        System.out.println("Your total price is  $" + totalPrice + " The shipping cost was $" + 0.02 * itemPrice);
    }
}


