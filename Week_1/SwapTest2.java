package Week_1;

class MutableDouble {
    public double value;
    public MutableDouble(double value) {
        this.value = value;
    }
}

public class SwapTest2 {
    public static <T> void swap(MutableDouble x, MutableDouble y) {
        double temp = x.value;
        x.value = y.value;
        y.value = temp;
    }

    public static void main(String args[]) {
        MutableDouble x = new MutableDouble(99.0);
        MutableDouble y = new MutableDouble(66.0);
        System.out.println("x = " + x.value + " " + "y = " + y.value);
        swap(x, y);
        System.out.println("x = " + x.value + " " + "y = " + y.value);
    }
}
