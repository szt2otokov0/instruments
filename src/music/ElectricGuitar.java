package music;

public class ElectricGuitar extends StringedInstrument{
    private final String name = "electric guitar";
    private final String sound;
    private final int numberOfStrings;
    @Override
    protected String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println(sound);
    }

    @Override
    public int numberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String sound() {
        return sound;
    }

    public ElectricGuitar(){
        numberOfStrings = 6;
        sound = "Twang";
    }
}
