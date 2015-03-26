package app;
public class ListObject {
    String name, serial;
    int index;
    public ListObject(String name, String serial, int index) {
        this.name = name;
        this.serial = serial;
        this.index = index;
    }
    @Override
    public String toString(){
        return name;
    }
}
