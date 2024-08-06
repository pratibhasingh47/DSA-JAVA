package Week_1;

public class PairData<T, V> {
    // Two fields of generic type T and V
    private T x;
    private V y;

    // Constructor
    public PairData(T a, V b) {
        x = a;
        y = b;
    }

    // Get the T-type value for a pair-data
    public T getTvalue() {
        return x;
    }

    // Get the V-type value for a pair-data
    public V getVvalue() {
        return y;
    }

    // To print the data member in an object
    public void printData() {
        System.out.println(getTvalue() + ", " + getVvalue());
    }
}

// The driver class
class MultiParameterGenericClassTest {
    public static void main(String args[]) {
        // A pair data with both members as String
        PairData<String, String> a = new PairData<>("Debasis", "Samanta");
        a.printData();

        // A pair data with the first member as String and other as Integer
        PairData<String, Integer> b = new PairData<>("Debasis", 789);
        b.printData();

        // A pair data with the first member as Integer and other as String
        PairData<Integer, String> c = new PairData<>(943, "Samanta");
        c.printData();

        // A pair data with the first member as Integer and other as Double
        PairData<Integer, Double> d = new PairData<>(555, 12.34);
        d.printData();
    }
}
