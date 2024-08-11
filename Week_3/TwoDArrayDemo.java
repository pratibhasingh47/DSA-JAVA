public class TwoDArrayDemo {
    public static void main(String[] args) {
        TwoDArray x = new TwoDArray(3, 4);
        x.initialize();
        TwoDArray y = new TwoDArray(3, 4);
        y.initialize();

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