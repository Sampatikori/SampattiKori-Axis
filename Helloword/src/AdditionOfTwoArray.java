public class AdditionOfTwoArray {
        public static void main(String[] args) {
            int a[][] = new int[][]{{9,4},{8,2}};
            int b[][] = new int[][]{{8,0},{8,8}};
            int c[][]= new int[2][2];

            for (int i =0;i<2;i++){
                for (int j = 0; j < 2; j++) {
                    c[i][j]=a[i][j]+b[i][j];

                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("\n");
            }
        }
    }

