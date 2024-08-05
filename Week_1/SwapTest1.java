package Week_1;

public class SwapTest1 {
    public static <T> void swap(T x, T y) {
        T temp = x;
        x = y;
        y = temp;
    }

    public static void main(String args[]){
        Integer x = new Integer(99);
        Integer y = new Integer(66);
        System.out.println("x = " + x + " " + "y = " + y);
        swap(x, y);
        System.out.println("x = " + x + " " + "y = " + y);
    }
}
