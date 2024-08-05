package Week_1;

class MutableInt {
    public int value;
    public MutableInt(int value) {
        this.value = value;
    }
}

public class SwapTest1 {
    public static void swap(MutableInt x, MutableInt y) {
        int temp = x.value;
        x.value = y.value;
        y.value = temp;
    }

    public static void main(String args[]){
        MutableInt x = new MutableInt(99);
        MutableInt y = new MutableInt(66);
        System.out.println("x = " + x.value + " " + "y = " + y.value);
        swap(x, y);
        System.out.println("x = " + x.value + " " + "y = " + y.value);
    }
}
