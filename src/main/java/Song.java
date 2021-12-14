import java.io.PrintStream;

class Song {
    private final int maxNumber;

    Song(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void sing(PrintStream out) {
        for (int beers = maxNumber; beers > -1; beers--) {
            new Verse(beers, maxNumber).verse(out);
        }
    }
}
