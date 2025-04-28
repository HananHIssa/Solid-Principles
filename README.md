# 🌟 SOLID Principles and More

## 🌈 Once Upon a Time in the World of Code...

Are you ready to dive into an inspiring story about Uncle Bob?
Uncle Bob, a true legend in the world of **Clean Code** (and don’t worry if you’re new to it — we’re on this journey together!), believed that code should be as clean and beautiful as a well-crafted masterpiece.

In the year 2000, he published a groundbreaking article titled **"Design Principles and Design Patterns."**
In this article, he emphasized a powerful message: **Software must be maintainable, flexible, and ready for change** — just like a living organism adapting to its environment.

From these insights, Uncle Bob crafted a golden formula — a collection of best practices to build strong, elegant software.
He called it **SOLID**.

## 📚 What is SOLID?

It's not just a word; it's a **philosophy**.
An acronym formed from **five fundamental design principles** that guide developers toward writing robust and scalable code.

Let's break down these five principles:

### S - Single Responsibility Principle (SRP)
- **"A class should have only one reason to change."**
- A class should do **one job**. This ensures it is not overly complex and has a single, well-defined purpose.

### O - Open/Closed Principle (OCP)
- **"Software entities should be open for extension but closed for modification."**
- Add new functionality without modifying existing code.

### L - Liskov Substitution Principle (LSP)
- **"Subtypes must be substitutable for their base types."**
- Ensure inheritance is used correctly so that subclasses can stand in for their parent classes.

### I - Interface Segregation Principle (ISP)
- **"No client should be forced to depend on methods it does not use."**
- Break large interfaces into smaller, specific ones to increase flexibility.

### D - Dependency Inversion Principle (DIP)
- **"High-level modules should not depend on low-level modules. Both should depend on abstractions."**
- Focus on decoupling dependencies between modules to make the system flexible and maintainable.

## 📄 Examples and Unit Testing

In the provided code examples, we demonstrated each principle through small, practical applications, and wrote simple **unit tests** to verify that each principle is applied correctly.

If you need to understand more clearly, take a quick look at the examples above.
If you're interested in **testing** (like I am 🧙‍♂️), I've also uploaded simple unit tests for each principle.

**Sources:**
- [JavaTechOnline - MCQ on SOLID Principles](https://javatechonline.com/mcq-on-solid-principles-practice-test/)
- [Skilr - SOLID Principles Practice Exam](https://www.skilr.com/solid-principles-practice-exam)
- [QuizGecko - SOLID Principles Quiz](https://quizgecko.com/learn/solid-principles-quiz-o6uhap)
- [GeeksforGeeks - SOLID Principle in Programming](https://www.geeksforgeeks.org/solid-principle-in-programming-understand-with-real-life-examples/)

---

# 🌟 Bonus: Other Things I've Learned

## 🔹 Polymorphism in OOP

Polymorphism means **calling a child class through its parent reference** and determining which child to use either during:
- **Runtime** (Dynamic method overriding)
- **Compile-time** (Static method overloading)

Don't worry! I'll explain simply:

### ✨ Dynamic Method Overriding
- Child selected **during code running** according to object type.
- Requires **inheritance**.

#### Example:
```java
abstract class Animal {
    public abstract void sound();
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();  // Output: Bark
    }
}
```

### ✨ Static Method Overloading
- Method selected **during compile time** based on method signature.
- **Does not need inheritance.**

#### Example:
```java
public class Calculator {

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));      // Output: 3
        System.out.println(add(1, 2, 3));    // Output: 6
    }
}
```

---

## 🔹 Static Methods, Static Classes vs. Instance Methods, Instance Classes

### 🔍 Static Method
- Belongs to the class itself.
- Can call another static method.
- Can create objects of a static class (where language allows).
- Cannot be overridden.

### 🔍 Instance Method
- Belongs to an object.
- Requires object creation.
- Can be overridden.

### 🔍 Static Class
- Cannot be instantiated (in languages like C#).
- In Java, only **nested classes** can be static.
- Can contain only static members.

### 🔍 Instance Class
- Regular class.
- Can create multiple instances (objects).

### ✔️ Quick Example
```java
public class Example {

    static class StaticClass {
        public static void staticMethod() {
            System.out.println("Static method called.");
        }
    }

    public void instanceMethod() {
        System.out.println("Instance method called.");
    }

    public static void main(String[] args) {
        StaticClass.staticMethod();

        Example example = new Example();
        example.instanceMethod();
    }
}
```

---

> ✨ I hope this README helps you enjoy and better understand SOLID principles and some important OOP fundamentals! Let's keep learning and growing! ✨

