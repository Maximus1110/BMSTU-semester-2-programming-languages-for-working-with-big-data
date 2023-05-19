//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;

public class Matrix {
    private int[][] data;
    private int m;
    private int n;

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        this.data = new int[m][n];
    }

    public Matrix(int[][] data) {
        this.data = data;
        this.m = data.length;
        this.n = data[0].length;
    }

    public Matrix(int m, int n, int max) {
        this.m = m;
        this.n = n;
        this.data = new int[m][n];
        Random rand = new Random();

        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                this.data[i][j] = rand.nextInt(max + 1);
            }
        }

    }

    public Matrix(Matrix matrix) {
        this.m = matrix.m;
        this.n = matrix.n;
        this.data = new int[this.m][this.n];

        for(int i = 0; i < this.m; ++i) {
            for(int j = 0; j < this.n; ++j) {
                this.data[i][j] = matrix.data[i][j];
            }
        }

    }

    public int getM() {
        return this.m;
    }

    public int getN() {
        return this.n;
    }

    public int[][] getData() {
        return this.data;
    }

    public void print() {
        for(int i = 0; i < this.m; ++i) {
            for(int j = 0; j < this.n; ++j) {
                System.out.print(this.data[i][j] + " ");
            }

            System.out.println();
        }

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < this.m; ++i) {
            for(int j = 0; j < this.n; ++j) {
                sb.append(this.data[i][j] + " ");
            }

            sb.append("\n");
        }

        return sb.toString();
    }

    public Matrix swapRowsWithMaxAndMinElements(int k) {
        int[][] newData = (int[][])this.data.clone();
        int maxRowIndex = 0;
        int minRowIndex = 0;

        for(int i = 1; i < this.m; ++i) {
            if (newData[i][k] > newData[maxRowIndex][k]) {
                maxRowIndex = i;
            }

            if (newData[i][k] < newData[minRowIndex][k]) {
                minRowIndex = i;
            }
        }

        int[] temp = newData[maxRowIndex];
        newData[maxRowIndex] = newData[minRowIndex];
        newData[minRowIndex] = temp;
        return new Matrix(newData);
    }

    public Matrix square() {
        int[][] newData = new int[this.m][this.n];

        for(int i = 0; i < this.m; ++i) {
            for(int j = 0; j < this.n; ++j) {
                int sum = 0;

                for(int k = 0; k < this.n; ++k) {
                    sum += this.data[i][k] * this.data[k][j];
                }

                newData[i][j] = sum;
            }
        }

        return new Matrix(newData);
    }

    public static void demonstration(int n) {
        System.out.println("ЛР 3.5 'Matrix'");
        Matrix matrix = new Matrix(n, n, 100);
        System.out.println("Сгенерированная матрица:");
        matrix.print();
        int k = 0;
        Matrix swappedMatrix = matrix.swapRowsWithMaxAndMinElements(k);
        System.out.println("Матрица после замены строк с максимальным и минимальным элементами в столбце " + k + ":");
        swappedMatrix.print();
        Matrix squaredMatrix = matrix.square();
        System.out.println("Квадрат матрицы:");
        squaredMatrix.print();
    }
}
