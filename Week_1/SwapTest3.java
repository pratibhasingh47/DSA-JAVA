package Week_1;

class MutableString {
    public String value;

    public MutableString(String value) {
        this.value = value;
    }
}

public class SwapTest3 {
    public static void swap(MutableString x, MutableString y) {
        String temp = x.value;
        x.value = y.value;
        y.value = temp;
    }

    public static void main(String args[]) {
        MutableString x = new MutableString("99");
        MutableString y = new MutableString("66");
        System.out.println("x = " + x.value + " " + "y = " + y.value);
        swap(x, y);
        System.out.println("x = " + x.value + " " + "y = " + y.value);
    }
}
