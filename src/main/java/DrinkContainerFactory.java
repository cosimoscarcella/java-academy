public class DrinkContainerFactory {
    private final int maxNumber;

    public static DrinkContainerFactory mkFactory(int maxNumber) {
        return new DrinkContainerFactory(maxNumber);
    }

    private DrinkContainerFactory(int maxNumber) {
        this.maxNumber = maxNumber;
    }


    public DrinkContainer getContainer(int number) {
        if (number == 0)
            return new NoMoreBottles(maxNumber);
        else if (number == 6)
            return  new SixPack();
        else if (number == 1)
            return new SingleBottle();
        return new MultipleBottles(number);
    }
}
