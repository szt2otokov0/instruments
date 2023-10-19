package music;

public class Violin extends StringedInstrument{
    private final String name = "violin";
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

    public Violin(){
        numberOfStrings = 4;
        sound = "Screech";
    }
}
