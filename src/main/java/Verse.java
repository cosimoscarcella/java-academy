import java.io.PrintStream;

class Verse {
    private final int number;
    private final int maxNumber;

    public Verse(int number, int maxNumber) {
        this.number = number;
        this.maxNumber = maxNumber;
    }

    public void verse(PrintStream out) {
        DrinkContainer container = getContainer(number);
        out.print(container.containerName() + " of beer on the wall,");
        out.println(container.containerName() + " of beer,");
        out.print(action(number));
        out.println(getContainer(container.nextRound()).containerName() + " of beer on the wall.\r\n");
    }

    private static String action(int number) {
        if (number == 0) return "Go to the store, buy some more,";
        else return "Take one down, pass it around,";
    }

    private DrinkContainer getContainer(int number) {
        return DrinkContainerFactory.mkFactory(maxNumber).getContainer(number) ;
    }

}
