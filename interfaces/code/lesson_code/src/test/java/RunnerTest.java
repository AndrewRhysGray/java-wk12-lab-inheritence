import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunnerTest {

    Runner runner;

    @Before
    public void before() {
        runner = new Runner();
    }

    @Test
    public void hasDistanceAtBeginning() {
        assertEquals(0, runner.getDistanceTravelled());
    }

    @Test
    public void canRun() {
        runner.run(10);
        assertEquals(100, runner.getDistanceTravelled());
    }

    @Test
    public void canBeTreatedAsInterfaceType() {
        IRun somethingThatRuns = new Runner();
        somethingThatRuns.run(10);

//        assertEquals(100, somethingThatRuns.getDistanceTravelled());
    }

}
