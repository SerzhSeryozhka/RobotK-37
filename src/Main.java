public class Main {
    public static void main(String[] args) {
        int[][] matrix;
        int kStrok = 21;
        int kStolb = 21;
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
    public int startPoint(){
       // int R =matrix[3][3];
       // return(R);
        return 0;
    }
    public void s()
    {
   //     int s=[i++][j];
    }
}

/*class Point {    int x, y;    public Point(int x, int y) {        this.x = x;        this.y = y;    }}*/
