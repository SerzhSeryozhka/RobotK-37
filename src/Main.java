public class Main {
    public static void main(String[] args) {
        int[][] matrix;
        int kStrok = 25;
        int kStolb = 25;
        matrix = new int[kStrok][kStolb];
        printMatx(matrix);
    }

    public static void printMatx(int[][] matx) {
        for (int i = 0; i < matx.length; i++) {
            for (int j = 0; j < matx[i].length; j++) {
                System.out.printf("%2d", matx[i][j]);
            }
            System.out.println();
        }
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


}
