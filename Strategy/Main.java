public class Main {
    public static void main(String[] args){
        Game game1 = new Game(new Ryu());
        game1.play(20,50,100);

        System.out.println();

        Game game2 = new Game(new Ken());
        game2.play(20,50,100);

        System.out.println();

        Game game3 = new Game(new ChunLi());
        game3.play(18,100,50);

        System.out.println();
    }
}