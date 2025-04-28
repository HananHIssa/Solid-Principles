
package stratgy;

public abstract class Duck {
public FlyBehavior flybehavior;
public QackBehavior quackBehavior;
public void performfly()
{
    flybehavior.fly();
}
public void performQack()
{
    quackBehavior.qack();
}
}
