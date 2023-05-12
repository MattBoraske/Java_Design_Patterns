public class Observer {
    private Subject subject;
    private String name;

    public Observer(String name, Subject subject){
        this.name = name;
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update(int state){
        System.out.println( this.toString() + " new state: " + state);
    }

    public void setState(int state){
        subject.setState(state);
    }

    //override toString()
    public String toString(){
        return "Observer " + name + "";
    }
}
