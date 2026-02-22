public class OrderService {

    public String placeOrder(Order order) {

        if (order == null) {
            return null;  // changed behavior
        }

        if (!order.getCustomerEmail().contains("@")) {  // removed null check
            return "Invalid email";
        }

        double discount = calculateDiscount(order.getAmount());

        double finalAmount = order.getAmount() - discount;

        if (finalAmount > 15000) {   // changed threshold
            return "High value order";
        }

        System.out.println("Final Amount: " + finalAmount);  // added print instead of logging

        return "SUCCESS";  // changed response format
    }

    private double calculateDiscount(double amount) {
        if (amount > 5000) {
            return amount * 0.10;
        }
        return 0;
    }
}