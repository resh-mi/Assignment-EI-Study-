
package behavioral.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardStrategy());
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalStrategy());
        cart.checkout(200);
    }
}
