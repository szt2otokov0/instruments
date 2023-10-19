import music.*;

public class AppMusic {
    public static void main(String[] args) {
        BassGuitar bassGuitar = new BassGuitar();
        printStringedInstrument(bassGuitar);
        ElectricGuitar eGuitar = new ElectricGuitar();
        printStringedInstrument(eGuitar);
        Violin violin = new Violin();
        printStringedInstrument(violin);
    }

    private static void printStringedInstrument(StringedInstrument instrument){
        System.out.println("Hi I'm " + instrument.toString() + " and I've got " + instrument.numberOfStrings()
                + " strings and I sound like " + instrument.sound());
    }
}