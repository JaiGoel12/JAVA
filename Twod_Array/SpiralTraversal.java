package Twod_Array;

        import java.util.*;
        class SpiralTraversal {
            public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int row = sc.nextInt();
                int col = sc.nextInt();
                int[][] m = new int[row][col];
                for(int i=0;i<row;i++) {
                    for(int j=0;j<col;j++) {
                        m[i][j] = sc.nextInt();
                    }
                }
                int toprow = 0;
                int bottomrow = row - 1;
                int leftcol = 0;
                int rightcol = col - 1;
                while(toprow <= bottomrow && leftcol <= rightcol) {
                    for(int i=leftcol;i<=rightcol;i++) {
                        System.out.print(m[leftcol][i] + " ");
                    }
                    toprow++;
                    for(int i=toprow;i<=bottomrow;i++) {
                        System.out.print(m[i][rightcol] + " ");
                    }
                    rightcol--;
                    if (toprow <= bottomrow) {
                        for (int i=rightcol;i>=leftcol;i--) {
                            System.out.print(m[bottomrow][i] + " ");
                        }
                        bottomrow--;
                    }
                    if (leftcol <= rightcol) {
                        for (int i=bottomrow;i>=toprow;i--) {
                            System.out.print(m[i][leftcol] + " ");
                        }
                        leftcol++;
                    }

                }
            }
        }
