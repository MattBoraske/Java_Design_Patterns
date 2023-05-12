import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();
    private int state;

    public void attach(Observer observer){
        if (!observerList.contains(observer)) observerList.add(observer);
    }

    public void detach(Observer observer){
        observerList.remove(observer);
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers(){
        for (Observer observer: observerList) observer.update(state);
    }
}
