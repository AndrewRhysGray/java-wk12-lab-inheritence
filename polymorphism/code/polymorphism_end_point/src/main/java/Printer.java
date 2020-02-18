public class Printer implements INetworkable {

    private int inkLevel;

    public Printer(int inkLevel) {
        this.inkLevel = inkLevel;
    }

    public int getInkLevel() {
        return inkLevel;
    }

    public String print(String data){
        return "printing: " + data;
    }

    @Override
    public String getStatus() {
        if (this.inkLevel >= 20){
            return "Ink Cool Yo";
        } else {
            return "Ink Low";
        }
    }
}