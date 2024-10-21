package Task1;

public class ConcreteObserver2 implements Observer {
    public void update(String message) {
        System.out.println("Task1.Observer 2 received update: " + message);
    }
}
