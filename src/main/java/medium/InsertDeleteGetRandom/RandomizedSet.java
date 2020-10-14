package medium.InsertDeleteGetRandom;

import java.util.*;

public class RandomizedSet {
    private Set<Integer> randomizedSet;
    private Random rand;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        randomizedSet = new HashSet<>();
        rand = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        return randomizedSet.add(val);
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        return randomizedSet.remove(val);
    }

    /** Get a random element from the set.
     * @return*/
    public int getRandom() {
        int index = rand.nextInt(randomizedSet.size());
        Iterator<Integer> iter = randomizedSet.iterator();
        for (int i = 0; i < index; i++) {
            iter.next();
        }
        return iter.next();
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
        randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
        randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
        randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
        randomizedSet.insert(2); // 2 was already in the set, so return false.
        int r = randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.
    }
}
