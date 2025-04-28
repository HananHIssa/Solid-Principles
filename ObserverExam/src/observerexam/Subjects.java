
package observerexam;

public interface Subjects {
    public void register(Observer o);
    public void remove(Observer o);
    public void notifyObserver();
}
