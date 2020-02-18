import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarathonRunnerTest {

    MarathonRunner marathonRunner;

    @Before
    public void before() {
        marathonRunner = new MarathonRunner();
    }

    @Test
    public void hasDistanceAtBeginning() {
        assertEquals(0, marathonRunner.getDistanceTravelled());
    }

    @Test
    public void canRun() {
        marathonRunner.run(26);
        assertEquals(26, marathonRunner.getDistanceTravelled());
    }

    @Test
    public void canBeReferedToAsInterfaceType() {
        IRun somethingThatRuns = new MarathonRunner();
        somethingThatRuns.run(26);
        assertEquals(26, ((MarathonRunner) somethingThatRuns).getDistanceTravelled());
    }



}
