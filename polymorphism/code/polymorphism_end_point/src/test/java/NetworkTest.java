import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    Computer computer;
    Printer printer;

    @Before
    public void before() {
        network = new Network("CodeClan");
        computer = new Computer("Keith's Computer", "Apple", "Macbook Pro");
        printer = new Printer(19);
        INetworkable device = computer;
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(computer);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void canConnectPrinter() {  //NEW TEST
        network.connect(printer);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll(){
        network.connect(computer);
        network.connect(printer);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }
}
