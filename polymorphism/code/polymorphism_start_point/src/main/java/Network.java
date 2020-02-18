import java.util.*;

public class Network {
    private String name;
    private ArrayList<Computer> computers;
    private ArrayList<Printer> printers;

    public Network(String name){
        this.computers = new ArrayList<Computer>();
        this.printers = new ArrayList<Printer>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return computers.size() + printers.size();
    }

    public void connect(Computer computer){
        computers.add(computer);
    }

    public void connect(Printer printer){
        printers.add(printer);
    }

    public void disconnectAll(){
        computers.clear();
        printers.clear();
    }
}