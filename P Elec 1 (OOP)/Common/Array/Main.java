public class Main {
    public static void main(String[] args) {
        int ai, row, col, i;
        int students[][][][] = {
                {
                        {
                                { 50, 49 }
                        },
                        {
                                { 51, 47 }
                        },
                        {
                                { 52, 43 }
                        }
                },
                {
                        {
                                { 40, 30, 31 }
                        },
                        {
                                { 45, 35 }
                        }
                },
                {
                        {
                                { 41, 31 }
                        },
                        {
                                { 46, 38, 48 }
                        }
                },
                {
                        {
                                { 44, 39 }
                        },
                        {
                                { 23, 45 },
                                { 10, 5 }
                        }
                }
        };
        // a r c
        for (ai = 0; ai < students.length; ai++) {
            for (row = 0; row < students[ai].length; row++) {
                for (col = 0; col < students[ai][row].length; col++) {
                    for (i = 0; i < students[ai][row][col].length; i++) {
                        System.out.print(students[ai][row][col][i] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}