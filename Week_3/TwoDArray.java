package Week_3;

import java.util.*;

public class TwoDArray {
    int[][] a;
    int[][] b;
    int row;
    int col;

    TwoDArray(int row, int col) {
        a = new int[row][col];
        this.row = row;
        this.col = col;
    }

    public void initialize(Scanner in) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter a[%d][%d]: ", i, j);
                a[i][j] = in.nextInt();
            }
        }
        // in.close();
    }

    public void printRowMajor() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printColMajor() {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    public int[][] addition(int[][] b) {
        if (this.row != b.length || this.col != b[0].length) {
            System.out.println("Error! Matrices are not of proper size.");
            return null;
        } else {
            int[][] c = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    c[i][j] = this.a[i][j] + b[i][j];
                }
            }
            return c;
        }
    }

    public int[][] multiplication(int[][] b) {
        if (this.col != b.length) {
            System.out.println("Error! Matrices are not of proper size.");
            return null;
        } else {
            int[][] c = new int[row][b[0].length];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < b.length; k++) {
                        c[i][j] += this.a[i][k] * b[k][j];
                    }
                }
            }
            return c;
        }
    }
}
