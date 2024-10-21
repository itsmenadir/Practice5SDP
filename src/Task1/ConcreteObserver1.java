package Task1;

public class ConcreteObserver1 implements Observer {
    public void update(String message) {
        System.out.println("Task1.Observer 1 received update: " + message);
    }
}


