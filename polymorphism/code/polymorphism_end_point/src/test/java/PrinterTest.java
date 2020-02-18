import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(19);
    }

    @Test
    public void canPrint(){
        assertEquals("printing: Hello World", printer.print("Hello World"));
    }

    @Test
    public void hasInkLevel(){
        assertEquals(19, printer.getInkLevel());
    }

    @Test
    public void statusIsInkLowWhenLessThan20(){
        assertEquals("Ink Low", printer.getStatus());
    }

    @Test
    public void statusIsInkCoolYoWhen20OrMore(){
        Printer printerWithEnoughInk = new Printer(20);
        assertEquals("Ink Cool Yo", printerWithEnoughInk.getStatus());
    }

}
