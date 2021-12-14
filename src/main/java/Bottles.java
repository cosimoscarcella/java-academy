import java.io.PrintStream;

class Bottles {
    private static final int maxNumber = 99;

    public static void main(String args[]) {
        extracted(System.out);
    }

    public static void extracted(PrintStream out) {
        new Song(maxNumber).sing(out);
    }

}