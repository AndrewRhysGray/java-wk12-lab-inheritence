public class Runner extends Athlete implements IRun {

    public Runner() {
        super();
    }

    public void run(int time) {
        this.distanceTravelled += 10 * time;
    }
}
