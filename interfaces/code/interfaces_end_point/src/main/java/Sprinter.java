public class Sprinter extends Athlete implements IRun {

    public void run(int distance) {
        this.runAsFastAsPossible(distance);
        this.distanceTravelled += distance;
    }

    private void runAsFastAsPossible(int distance) {
        // DO STUFF
    }
}
