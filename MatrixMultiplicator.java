package ru.lanit.first;

public class MatrixMultiplicator extends Matrix {
    private int[][] A;
    private int[][] B;
    private int[][] S;

    public int[][] getAM() {
        return A;
    }
    public void setAM(int[][] A) {
        this.A = A;
    }

    public int[][] getBM() {
        return B;
    }
    public void setBM(int[][] B) {
        this.B = B;
    }

    public int[][] getSM() {
        return S;
    }

    public void mult() {
        if(A[0].length != B.length) {
            System.out.println("Матрицы несогласованы!");
        }
        else {
            S = new int[A.length][B[0].length];
            for(int i = 0; i < A.length; i++) {
                for(int j = 0; j < B[0].length; j++) {
                    for(int k = 0; k < A[0].length; k++) {
                        S[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.print(S[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

}
