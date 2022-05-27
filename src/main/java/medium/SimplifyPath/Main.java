package medium.SimplifyPath;

public class Main {
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        Solution solution = new Solution();
        System.out.println(solution.simplifyPath(path));
    }
}
