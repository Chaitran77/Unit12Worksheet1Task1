public class Animal {

    private String state;
    private int size;

    public Animal(String s, int n) {
        state = s;
        size = n;
    }

    public void feed() {
        size++;
        if (size == 5) {
            state = "FISH";
        }
    }

    public String getState() {
        return state;
    }

    public int getSize() {
        return size;
    }
}
