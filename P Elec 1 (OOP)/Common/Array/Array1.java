public class Array1 {
    public static void main(String[] args) {
        int ai, row, col; // arc
        // int rents[] = { 100, 200, 300, 400, 500 };
        int rents[][][] = {
                {
                        { 100, 200, 300, 400, 500, 530 },
                        { 550, 600, 650, 700, 750 },
                        { 800, 850, 900, 950, 1000 }
                },
                {
                        { 100, 200, 300, 400, 500, 530 },
                        { 550, 600, 650, 700, 760 },
                        { 800, 850, 910, 950, 1000 }
                },
        };
        // System.out.print(rents[1][2][2]);
        // System.out.print(rents[2][1]);
        // System.out.print(rents[3]);
        // for (row = rents.length - 1; row >= 0; row--) {
        // System.out.println(rents[row] + " ");
        // }
        // for (row = 0; row < rents.length; row++) {
        // System.out.println(rents[row] + " ");
        // }
        for (ai = 0; ai < rents.length; ai++) {
            for (row = 0; row < rents[ai].length; row++) {
                for (col = 0; col < rents[ai][row].length; col++) {
                    System.out.print(rents[ai][row][col] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
