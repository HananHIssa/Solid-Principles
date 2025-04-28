
package wetherstations;
public interface Subject {
 public void addObservers(Observer o);   
 public void removeObservers(Observer o);
 public void notrifyObservers();
}
