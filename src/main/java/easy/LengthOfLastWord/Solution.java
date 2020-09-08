package easy.LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return (words.length != 0) ? words[words.length - 1].length() : 0;
    }

    public static void main(String[] args) {
        System.out.println("Res = " + new Solution().lengthOfLastWord(" "));
    }
}
