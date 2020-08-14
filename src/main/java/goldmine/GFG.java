package goldmine;

public class GFG {
    private int maxAmountOfGold;
    private int n;
    private int m;

    public int getMaxGold(int[][] gold, int n, int m) {
        this.n = n; // todo optimize
        this.m = m;

        for (int i = 0, j = 0; i < n; ++i) {
            findMaxAmountGoldInRow(gold, i, j, gold[i][j]);
        }
        return maxAmountOfGold;
    }

    private void findMaxAmountGoldInRow(int[][] gold, int i, int j, int currentMaxAmountOfGold) {
        if (j + 1 == m && currentMaxAmountOfGold > maxAmountOfGold) {
            maxAmountOfGold = currentMaxAmountOfGold;
            return;
        }

        if (i - 1 >= 0 && j + 1 < m) {
            findMaxAmountGoldInRow(gold, i - 1, j + 1, currentMaxAmountOfGold + gold[i - 1][j + 1]);
        }
        if (j + 1 < m) {
            findMaxAmountGoldInRow(gold, i, j + 1, currentMaxAmountOfGold + gold[i][j + 1]);
        }
        if (i + 1 < n && j + 1 < m) {
            findMaxAmountGoldInRow(gold, i + 1, j + 1, currentMaxAmountOfGold + gold[i + 1][j + 1]);
        }
    }

    public static void main(String[] args) {
//        int[][] gold = { // 12
//                {1, 3, 3},
//                {2, 1, 4},
//                {0, 6, 4}
//        };

        int[][] gold = { // 83
                {10, 33, 13, 15},
                {22, 21, 4, 1},
                {5, 0, 2, 3},
                {0, 6, 14, 2}
        };

//        int [][] gold = { // 16
//                {1, 3, 1, 5},
//                {2, 2, 4, 1},
//                {5, 0, 2, 3},
//                {0, 6, 1, 2}
//        };
        int maxAmountOfGold = new GFG().getMaxGold(gold, gold.length, gold[0].length);
        System.out.println("Res = " + maxAmountOfGold);
    }
}
