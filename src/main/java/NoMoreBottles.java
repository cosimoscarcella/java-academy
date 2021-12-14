public class NoMoreBottles implements DrinkContainer {

    private final int maxNumber;

    public NoMoreBottles(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public String containerName() {
        return "0 bottles";
    }

    @Override
    public int nextRound() {
        return maxNumber;
    }
}
