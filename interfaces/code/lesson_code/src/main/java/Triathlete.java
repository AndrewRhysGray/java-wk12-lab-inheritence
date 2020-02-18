public class Triathlete extends Athlete implements IRun, ISwim, ICycle {

    public void run(int time) {
        this.distanceTravelled += 5 * time;
    }

    public void swim(int time) {
        this.distanceTravelled += 2 * time;
    }

    public void cycle(int time) {
        this.distanceTravelled += 20 * time;
    }

}
