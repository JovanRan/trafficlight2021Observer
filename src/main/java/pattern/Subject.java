
package pattern;

public interface Subject {
    public void addObserver(Observer o);
    public void remove(Observer o);
    public void notifyObservers();
}
