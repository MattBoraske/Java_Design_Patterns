public class ChunLi implements Fighter{
    ChunLi(){};

    public void kick(int height){
        System.out.println("ChunLi kicks " + height + " feet high");
    }

    public void punch(int punch){
        System.out.println("ChunLi punches with " + punch + " power");
    }

    public void roll(int direction){
        System.out.println("ChunLi rolls " + direction + " feet");
    }
}
