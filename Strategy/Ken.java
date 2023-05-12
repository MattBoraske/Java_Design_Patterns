public class Ken implements Fighter{
    Ken(){};

    public void kick(int height){
        System.out.println("Ken kicks " + height + " feet high");
    }

    public void punch(int punch){
        System.out.println("Ken punches with " + punch + " power");
    }

    public void roll(int direction){
        System.out.println("Ken rolls " + direction + " feet");
    }
}
