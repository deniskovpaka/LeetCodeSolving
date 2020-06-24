package easy.StudentAttendanceRecord;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final char ABSENT = 'A';
    private static final char LATE = 'L';

    public boolean checkRecord(String s) {
        for (int i = 0, absentCount = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == ABSENT && ++absentCount > 1) {
                return false;
            } else if (ch == LATE && (i + 3) <= s.length()) {
                if (s.charAt(i + 1) == LATE && s.charAt(i + 2) == LATE) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "PPALLL";
        boolean res = new Solution().checkRecord(s);
        System.out.println("Res = " + res);
    }
}
