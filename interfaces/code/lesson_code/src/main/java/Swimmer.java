public class Swimmer extends Athlete implements ISwim {
    public void swim(int time) {
        this.distanceTravelled += 3 * time;
    }
}
