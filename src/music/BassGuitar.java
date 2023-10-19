package music;

public class BassGuitar extends StringedInstrument{
    private final String name = "bass guitar";
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

    public BassGuitar() {
        numberOfStrings = 4;
        sound = "Duum-duum-duum";
    }
}
