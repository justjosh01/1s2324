class Array {
    public static void main(String[] args) {
        int ai, row, col;
        // int rents[] = { 100, 200, 300, 400, 500 };//1D
        // int rents[][] = {
        // { 100, 200, 300, 400, 500 },
        // { 550, 600, 650, 700, 750 },
        // { 800, 850, 900, 950, 1000 }
        // };

        // System.out.print(rents[2]);
        // System.out.print(rents[1][2]);
        // for (loop = 0; loop < rents.length; loop++) {
        // System.out.println(rents[loop]);
        // }
        // for (row = 0; row < rents.length; row++) {
        // for (col = 0; col < rents[row].length; col++) {
        // System.out.print(rents[row][col] + " ");
        // }
        // System.out.println();
        // }

        int rents[][][] = {
                {
                        { 100, 200, 300, 400, 500 },
                        { 550, 600, 650, 700, 750 },
                        { 800, 850, 910, 950, 1000 }
                },
                {
                        { 100, 200, 300, 400, 500 },
                        { 550, 600, 650, 700, 750 },
                        { 800, 850, 900, 950, 1000 }
                },
                {
                        { 100, 200, 300, 400, 500 },
                        { 550, 600, 650, 700, 750 },
                        { 800, 850, 920, 950, 1000 }
                }

        };
        // System.out.print(rents[1][2][2]);
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