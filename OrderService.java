public class OrderService {

    public String placeOrder(Order order) {

        if (order.getCustomerEmail() == null || !order.getCustomerEmail().contains("@")) {
            return "Invalid email";
        }

        if (order.getAmount() <= 0) {
            return "Invalid order amount";
        }

        if (order.getAmount() > 10000) {
            return "Order requires manual approval";
        }

        return "Order placed successfully: " + order.getOrderId();
    }
}