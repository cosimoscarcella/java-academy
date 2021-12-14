public class SingleBottle implements DrinkContainer {

    @Override
    public String containerName() {
        return "1 bottle";
    }

    @Override
    public int nextRound() {
        return 0;
    }
}
