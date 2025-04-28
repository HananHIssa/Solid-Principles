
package duck;

public abstract class Duck {
FlyBehavior flybehavior;
QuackBehavior quackbehavior;

abstract void display();
public void performfly()
{
    flybehavior.fly();
}
public void performQuack()
{
    quackbehavior.quack();
}
public void swim() {
System.out.println("All ducks float, even decoys!");
	}
}
