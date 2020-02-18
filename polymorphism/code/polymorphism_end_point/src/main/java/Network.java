import java.util.*;

public class Network {
    private String name;
    private ArrayList<INetworkable> devices;

    public Network(String name){
        this.devices = new ArrayList<INetworkable>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(INetworkable device){
        devices.add(device);
    }

    public void disconnectAll(){
        devices.clear();
    }

    public String produceReport(){
        String report = "";
        for (INetworkable device : this.devices){
            report += device.getStatus();
        }
        return report;
    }


}