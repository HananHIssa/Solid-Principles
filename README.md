طبعًا!  
سأدمج لك كل محتوى الـ README اللي كتبناه (مقدمة SOLID + الملاحظات عن Polymorphism) بشكل أنيق وكامل وجاهز تستخدمه مباشرة. ✨  
هذه النسخة الكاملة:

---

# 📚 SOLID Principles — Learn and Apply

🌟 **Once upon a time in the world of code...**

Are you ready to dive into an inspiring story about Uncle Bob?  
Uncle Bob, a true legend in the world of **Clean Code** (and don’t worry if you’re new to it — we’re on this journey together!), believed that code should be as clean and beautiful as a well-crafted masterpiece. 

In the year 2000, he published a groundbreaking article titled **"Design Principles and Design Patterns."**  
In this article, he emphasized a powerful message:  
**Software must be maintainable, flexible, and ready for change** — just like a living organism adapting to its environment. 🌱✨

From these insights, Uncle Bob crafted a golden formula — a collection of best practices to build strong, elegant software.  
He called it **SOLID**.

---

## ✨ What is SOLID?

It's not just a word; it's a **philosophy** —  
An acronym formed from **five fundamental design principles** that guide developers toward writing robust and scalable code.

Let's break them down:

---

### 🧩 S — Single Responsibility Principle (SRP)
> "A class should have only one reason to change."  
Each class should focus on one job only, making it simple and well-organized.

---

### 🧩 O — Open/Closed Principle (OCP)
> "Software entities should be open for extension but closed for modification."  
You can add new features without altering the existing working code.

---

### 🧩 L — Liskov Substitution Principle (LSP)
> "Subtypes must be substitutable for their base types."  
Inheritance should be used correctly so that child classes behave like their parent classes without issues.

---

### 🧩 I — Interface Segregation Principle (ISP)
> "Do not force any client to depend on interfaces it does not use."  
Keep interfaces focused and avoid making classes implement irrelevant methods.

---

### 🧩 D — Dependency Inversion Principle (DIP)
> "High-level modules should not depend on low-level modules. Both should depend on abstractions."  
This promotes decoupling, making the system more flexible and maintainable.

---

## 🧪 Unit Testing

If you are interested in testing (just like me!), I have uploaded simple **unit tests** for each principle example above.  
Feel free to check them and practice!

---

## 🌟 Bonus: What Else I Learned During SOLID Study

During my SOLID principles study, I explored another important OOP concept called **Polymorphism**. Here's a short explanation:

---

### 🔹 What is Polymorphism?

Polymorphism means calling child classes through their parent class reference and deciding **which child** at:
- **Runtime**: (Dynamic Method Overriding)
- **Compile Time**: (Static Method Overloading)

Let’s dive deeper:

---

### 🔸 Dynamic Method Overriding
- **Definition:** The child class is selected during the program execution based on the object's type.
- **Inheritance is required.**
- **Example:**
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
        animal.sound(); // Output: Bark
    }
}
```

---

### 🔸 Static Method Overloading
- **Definition:** The method is selected during **compile time** based on the method's signature (parameters).
- **Inheritance is not required.**
- **Example:**
```java
public class Calculator {
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));     // Output: 3
        System.out.println(add(1, 2, 3));  // Output: 6
    }
}
```

---

✅ **Summary:**
- **Dynamic Overriding** = Decision during runtime (requires inheritance).
- **Static Overloading** = Decision during compile time (no inheritance needed).

---

## 📚 Sources:

- [JavaTechOnline - SOLID MCQs](https://javatechonline.com/mcq-on-solid-principles-practice-test/)
- [Skilr - SOLID Principles Exam](https://www.skilr.com/solid-principles-practice-exam)
- [QuizGecko - SOLID Quiz](https://quizgecko.com/learn/solid-principles-quiz-o6uhap)
- [GeeksForGeeks - SOLID Explained](https://www.geeksforgeeks.org/solid-principle-in-programming-understand-with-real-life-examples/)

---

# 🎯 Keep Learning and Keep Growing!

---
