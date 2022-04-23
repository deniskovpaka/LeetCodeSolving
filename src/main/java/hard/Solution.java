package hard;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {
    public static long prison(int n, int m, List<Integer> h, List<Integer> v) {
        int[][] prisonBoard = new int[n + 1][m + 1];
        h.sort(Comparator.naturalOrder());
        v.sort(Comparator.naturalOrder());

        for (Integer i : h) {
            for (Integer j : v) {
                removeBars(i, j, prisonBoard);
            }
        }
        return calculateLargestHole(prisonBoard);
    }

    private static long calculateLargestHole(int[][] prisonBoard) {
        return Stream.of(prisonBoard)
                .flatMapToInt(IntStream::of)
                .filter(value -> value == 1)
                .count();
    }

    private static void removeBars(Integer i, Integer j, int[][] prisonBoard) {
        prisonBoard[i][j] = 1;
        prisonBoard[i - 1][j] = 1;
        prisonBoard[i][j - 1] = 1;
        prisonBoard[i - 1][j - 1] = 1;
    }

    public static void main(String[] args) {
        int n = 6;
        int m = 7;
        List<Integer> h = new ArrayList<>();
        List<Integer> v = new ArrayList<>();
        h.add(2);
        h.add(4);
        h.add(5);

        v.add(2);
        v.add(5);
        v.add(6);

//        int n = 3;
//        int m = 3;
//        List<Integer> h = new ArrayList<>();
//        List<Integer> v = new ArrayList<>();
//        h.add(2);
//        v.add(2);
        System.out.println("Board = " + Solution.prison(n, m, h, v));
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        int m = Integer.parseInt(bufferedReader.readLine().trim());
//
//        int hCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> h = IntStream.range(0, hCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int vCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> v = IntStream.range(0, vCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        long result = Solution.prison(n, m, h, v);
//        System.out.println("Restult = " + result);
//
//    }
}
