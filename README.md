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


## Exercise 2 : Smart Home System Programming 

### Overview
This section of the repository contains a Smart Home System that leverages various design patterns to manage devices like lights, thermostats, and door locks. The system allows you to add devices, control them, and schedule automated actions through a console-based UI.

### Structure
The project is divided into several key components, each adhering to design principles for scalability and maintainability:
1. **Singleton Pattern**: The `SmartHomeHub` class ensures a single point of control for all devices.
2. **Factory Pattern**: The `DeviceFactory` dynamically creates devices based on user input.
3. **Abstract Base Class**: `SmartDevice` serves as the base for all smart devices, enabling consistent control of different device types.
4. **Proxy Pattern**: The `DeviceProxy` class manages access control and centralizes the handling of turning devices on or off.
5. **Scheduling Feature**: The `Scheduler` class provides a way to set up scheduled tasks for devices, making the system more dynamic and responsive.

### Design Details

#### 1. Singleton Pattern (SmartHomeHub)
- The `SmartHomeHub` class manages all connected devices in a centralized manner, ensuring that only one instance of the hub exists.
- This allows the system to have a single point of control for adding, removing, and managing devices.

#### 2. Factory Pattern (DeviceFactory)
- The `DeviceFactory` provides a clean way to create different types of smart devices (`Light`, `Thermostat`, `DoorLock`) based on user input.
- It centralizes device creation, improving code readability and maintainability.

#### 3. Proxy Pattern (DeviceProxy)
- `DeviceProxy` acts as an intermediary for `SmartDevice` instances, providing controlled access to device functionalities (e.g., turning on/off).
- This pattern allows for additional operations, such as logging or security checks, to be added without altering the main device classes.

#### 4. Abstract Class and Device Implementations
- **SmartDevice**: An abstract base class that defines common methods for all devices (`turnOn`, `turnOff`).
- **Light, Thermostat, DoorLock**: Concrete implementations of `SmartDevice`, with specific behaviors for each device type.

#### 5. Scheduler for Automation
- **Scheduler**: Allows users to schedule tasks for devices at specified times.
- Provides basic automation by linking specific actions (e.g., turning on/off) to scheduled events.

### Features
1. **Add Devices**: Users can add new devices (light, thermostat, or door lock) to the Smart Home Hub.
2. **Control Devices**: Users can turn devices on/off through a proxy class, which centralizes access.
3. **Schedule Actions**: Users can set up scheduled actions for devices, specifying the time and action to be performed (on/off).
4. **Display Devices and Schedules**: Users can view the list of all added devices and any scheduled tasks.

### How to Run the Code
1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/Assignment-EI-Study-.git

###Design Principles & Best Practices
**Encapsulation and Abstraction**: SmartDevice serves as an abstract class to enforce a consistent interface for all devices.
**Centralized Management**: The SmartHomeHub (Singleton Pattern) ensures a single point of control for all smart devices.
**Extendability & Maintainability**: The factory pattern allows for the easy addition of new device types without modifying existing code.
**Automation with Scheduling**: The Scheduler provides basic automation by scheduling actions, demonstrating how design patterns can integrate to create responsive systems.

**The Smart Home System exercise demonstrates practical use of multiple design patterns to build a modular, flexible, and maintainable system. The integration of these patterns provides a scalable way to manage various smart devices, respond to user inputs, and automate tasks based on schedules. This project emphasizes how design patterns can effectively organize code, enhance reusability, and promote clear separation of concerns.This exercise has allowed me to explore different design patterns and their practical applications. By implementing these patterns, I’ve aimed to showcase an understanding of how to solve real-world problems using design principles, ensuring code is maintainable, extendable, and efficient.**

Feel free to explore the code, run different patterns, and reach out if you have any questions or need further details!

