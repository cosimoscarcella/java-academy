class SixPack implements DrinkContainer {
    @Override
    public String containerName() {
        return "six-pack";
    }

    @Override
    public int nextRound() {
        return 5;
    }
}
