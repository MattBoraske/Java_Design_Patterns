public class Ryu implements Fighter{
    Ryu(){};

    public void kick(int height){
        System.out.println("Ryu kicks " + height + " feet high");
    }

    public void punch(int punch){
        System.out.println("Ryu punches with " + punch + " power");
    }

    public void roll(int direction){
        System.out.println("Ryu rolls " + direction + " feet");
    }
}