
package creational.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        DatabaseConnection dbConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection dbConnection2 = DatabaseConnection.getInstance();

        dbConnection1.connect();
        System.out.println("Both instances are same: " + (dbConnection1 == dbConnection2));
    }
}
