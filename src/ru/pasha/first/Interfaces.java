package ru.pasha.first;
import static java.lang.System.*;
public class Interfaces {
}
interface Instrument{
    void play();
    String KEY="Do major";
}
class Gitare implements Instrument{
    private int countStrings;
    @Override
    public void play() {
        out.println(this.getClass().getSimpleName()+
                " is played with "+countStrings+ " string(s).");
    }
    public Gitare(int countStrings) {
        this.countStrings = countStrings;
    }
}
class Drum implements Instrument{
    private int size;
    @Override
    public void play() {
        out.println(this.getClass().getSimpleName()+
                " is played, size= "+size+ " cm.");
    }
    public Drum(int size) {
        this.size = size;
    }
}
class Tube implements Instrument{
    private int diametr;
    @Override
    public void play() {
        out.println(this.getClass().getSimpleName()+
                " is played with diameter="+diametr+ " cm.");
    }
    public Tube(int diametr) {
        this.diametr = diametr;
    }
}
enum Seasons{
    // elems
    SPRING(12),
    SUMMER(22){
        @Override
        public String description() {
            return "Hot "+TY;
        }
    },
    AUTUMN(10),
    WINTER(-10){
        @Override
        public String description() {
            return "Cold "+TY;
        }
    };
    // fields
    private int temperature;
    private final static String TY=" season.";
    // methods
    public int getTemperature(){return temperature;}
    private Seasons(int temperature) {
        this.temperature = temperature;
    }
    public String description(){return "Normal"+TY;};
}

