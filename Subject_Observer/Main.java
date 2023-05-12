public class Main {
    public static void main(String[] args){
        Subject subject = new Subject();

        Observer x = new Observer("x", subject);
        Observer y = new Observer("y", subject);
        Observer z = new Observer("z", subject);

        x.setState(10);
        x.setState(11);
    }
}