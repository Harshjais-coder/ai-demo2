public class Main {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        Order order = new Order("ORD101", 2500.0, "harsh@example.com");

        String result = orderService.placeOrder(order);
        System.out.println(result); JAGFDJGKKKJGJJC
    }
}
