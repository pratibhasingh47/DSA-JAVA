package  Week_3;
import java.util.*;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TwoDArray x = new TwoDArray(3, 4);
        x.initialize(in);
        TwoDArray y = new TwoDArray(3, 4);
        y.initialize(in);

        int[][] z = x.addition(y.a);
        if (z != null) {
            for (int[] row : z) {
                System.out.println(Arrays.toString(row));
            }
        }

        z = x.multiplication(y.a);
        if (z != null) {
            for (int[] row : z) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}