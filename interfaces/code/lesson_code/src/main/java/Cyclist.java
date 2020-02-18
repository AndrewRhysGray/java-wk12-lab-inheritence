public class Cyclist extends Athlete implements ICycle {
    public void cycle(int time) {
        this.distanceTravelled += 50 * time;
    }
}
