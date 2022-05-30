package shildt10.chapter_3;

public class ThreeDMatrix {
    public static void main(String[] args) {
        int tdm[][][] = new int[3][4][5];
        int i, j, k, x = 0;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    tdm[i][j][k] = i * j * k;
                }
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++)
                    System.out.print(tdm[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }

    }

}
