package basic.ict.kosovo.growth;

public class MultiDimensionalArrayExample {
    public static void main(String[] args) {

        int[][] matrix = {
                {8, -2, 0},
                {3, 7, -1},
                {-2, 8, 4}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%5d", matrix[row][col]);
            }
            System.out.println();
        }
        System.out.println("Printimi me foreach");
        System.out.println("-----------------------------");

        for (int[] array : matrix) { //row
            for (int number : array) { //col
                System.out.printf("%5d", number);
            }
            System.out.println();
        }

    }

    void shikoDjathtas() {
        System.out.println("Shikova djathtas ->");
    }
}













