import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SprinterTest {

    Sprinter sprinter;

    @Before
    public void before() {
        sprinter = new Sprinter();
    }

    @Test
    public void hasDistanceAtBeginning() {
        assertEquals(0, sprinter.getDistanceTravelled());
    }

    @Test
    public void canRun() {
        sprinter.run(100);
        assertEquals(100, sprinter.getDistanceTravelled());
    }

    @Test
    public void canBeReferedToAsInterfaceType() {
        IRun somethingThatRuns = new Sprinter();
        somethingThatRuns.run(100);
        assertEquals(100, ((Sprinter) somethingThatRuns).getDistanceTravelled());
    }
}

