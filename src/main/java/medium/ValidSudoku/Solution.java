package medium.ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> values = new HashSet<>();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] != '.'
                        && (!values.add("row " + i + " value " + board[i][j])
                        || !values.add("column " + j + " value " + board[i][j])
                        || !values.add("row " + i / 3 + " column " + j / 3 + " value " + board[i][j]))) {
                    return false;
                }
            }
        }
        return true;
    }
}
