public class MarathonRunner extends Athlete implements IRun {

    private int marathonPace;

    public void run(int distance) {
        this.runAtMarathonPace(distance);
        this.distanceTravelled += distance;
    }

    private void runAtMarathonPace(int distance) {
        // DO STUFF
    }
}