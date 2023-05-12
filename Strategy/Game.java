public class Game {
    private Fighter fighter;

    Game(Fighter fighter){
        this.fighter = fighter;
    }

    public void play(int height, int power, int direction){
        fighter.kick(height);
        fighter.punch(power);
        fighter.roll(direction);
    }
}
