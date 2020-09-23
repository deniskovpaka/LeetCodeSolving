package easy.DistributeCandiesToPeople;

import java.util.Arrays;

public class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] peoples = new int[num_people];
        for (int i = 0, j = 1; candies > 0; ++i, ++j) {
            int current_candies = (candies - j) > 0 ? j : candies;
            candies -= j;
            peoples[i % num_people] += current_candies;
        }
        return peoples;
    }

    public static void main(String[] args) {
        int candies = 10;
        int num_people = 3;
        int[] res = new Solution().distributeCandies(candies, num_people);
        Arrays.stream(res).forEach(System.out::print);
    }
}
