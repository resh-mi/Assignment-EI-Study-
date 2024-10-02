
package creational.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification("EMAIL");
        notification.notifyUser();
    }
}
