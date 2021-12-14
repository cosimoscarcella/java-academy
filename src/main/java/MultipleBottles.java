public class MultipleBottles implements DrinkContainer {
    private final int number;

    public MultipleBottles(int number) {
        this.number = number;
    }

    @Override
    public String containerName() {
        return number + " bottles";
    }

    @Override
    public int nextRound() {
        return number - 1;
    }
}
