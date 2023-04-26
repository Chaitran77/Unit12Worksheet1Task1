public class Main {

    static String thisFishState = "Fish";
    static int thisFishSize = 1;

    public static void main(String[] args) {

        System.out.println(thisFishState + " is of size " + thisFishSize);
        while (!thisFishState.equals("FISH")) {
            feed(thisFishState, thisFishSize);
        }
        System.out.println("It is now a big " + thisFishState);
    }

    public static void feed(String state, int size) {
        thisFishSize++;
        System.out.println("Fish fed");
        if (size == 5) {
            thisFishState = "FISH";
        }
    }
}