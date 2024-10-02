# **Solution to the Assignment of Ei Study**

## **Excercise 1**
This repository contains my solution to the first exercise of the Ei Study assignment, where I demonstrate six different use cases of software design patterns in Java. Each use case aligns with global best practices for clarity, modularity, and performance.

## **Structure**
The repository is organized as follows:
1. **Behavioral Patterns**  
   - **Observer Pattern**: A weather station notifies multiple display devices of temperature changes.
   - **Strategy Pattern**: A shopping cart enables the user to select between payment methods.

2. **Creational Patterns**  
   - **Singleton Pattern**: Manages a single database connection throughout the application lifecycle.
   - **Factory Pattern**: Dynamically creates different types of notifications (SMS, Email).

3. **Structural Patterns**  
   - **Adapter Pattern**: Allows a media player to handle multiple formats like MP3.
   - **Decorator Pattern**: Adds optional features (e.g., milk) to a coffee order dynamically.

Each pattern adheres to high coding standards, ensuring easy maintenance, strong error handling, and smooth runtime performance.

## **Implementation Highlights**

### **1. Behavioral Patterns**
- **Observer Pattern**: 
  - A `WeatherStation` object notifies its subscribers (`PhoneDisplay`) whenever the temperature changes.
  - This pattern helps showcase how real-time updates can be propagated to multiple observers seamlessly.

- **Strategy Pattern**: 
  - The `ShoppingCart` class allows the user to select from different payment strategies (`CreditCard`, `PayPal`).
  - Enables runtime switching between algorithms, showcasing flexibility in handling payment processes.

### **2. Creational Patterns**
- **Singleton Pattern**:
  - `DatabaseConnection` ensures a single connection instance, optimizing resource usage and maintaining global access throughout the application.
  - Demonstrates how to efficiently manage shared resources.

- **Factory Pattern**:
  - A `NotificationFactory` creates different notification objects (`SMSNotification`, `EmailNotification`) based on user input.
  - This pattern keeps object creation logic centralized and scalable, supporting easy future extensions.

### **3. Structural Patterns**
- **Adapter Pattern**:
  - Adapts `MediaPlayer` to play different media formats using a `MediaAdapter`.
  - Highlights the ability to integrate and adapt incompatible interfaces for seamless usage.

- **Decorator Pattern**:
  - `CoffeeDecorator` dynamically adds functionalities (like `MilkDecorator`) to `SimpleCoffee`, demonstrating how objects can gain new features without altering their structure.
  - This pattern emphasizes flexibility in extending an object's behavior.

## **How to Run the Code**
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/Assignment-EI-Study.git

This exercise has allowed me to explore different design patterns and their practical applications. By implementing these patterns, I’ve aimed to showcase an understanding of how to solve real-world problems using design principles, ensuring code is maintainable, extendable, and efficient.

Feel free to explore the code, run different patterns, and reach out if you have any questions or need further details!

