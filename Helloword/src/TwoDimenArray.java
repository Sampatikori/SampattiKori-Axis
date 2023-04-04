public class TwoDimenArray {
    public static void main(String[] args) {
        int[][] matrix = {{9, 4, 8}, {2, 8, 0}, {8, 8, 9}};


        System.out.println("The matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
