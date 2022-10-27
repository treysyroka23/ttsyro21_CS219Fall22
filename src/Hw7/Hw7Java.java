package Hw7;

import java.util.Arrays;

public class Hw7Java {

    /*
        Return true if two values next to each other in the array are the same.
        See the tests in main.  The array should not be modified or reordered.
     */
    public static boolean hasAdjacent(String [] aos) {
        for (int i = 0; i < aos.length - 1; i++) {
            if (aos[i].equals(aos[i + 1]))
                return true;
        }
        return false;
    }

    /*
        Return true if the array has a duplicate. Make sure the array
        is not modified or reordered. That is, don't sort it and check
        for adjacent values that are the same.
        Hint 1: need to look at all possible pairs of array entries.
     */
    public static boolean hasDuplicate(String [] aos) {
        for (int i = 0; i < aos.length; i++) {
            for (int j = i + 1; j < aos.length; j ++) {
                if (aos[i].equals((aos[j]))) {
                    return true;
                }
            }
        }
        return false; // shut up error message
    }

    /*
        Return true if two values at different locations in the array add up
        to the target.  Same hint as hasDuplicate.  See the tests in main.
     */
    public static boolean goofy(int [] nums, int target) {
        for (int i = 0; i < nums.length; i ++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }
        return false; // shut up error message
    }

    /*
        Turn string s into an array of characters and return the array.
     */
    public static char [] make_array(String s) {
        char [] aoc = new char[s.length()];
        aoc = s.toCharArray();
        char [] char_array = new char [aoc.length];
        for (int i = 0; i < aoc.length; i++) {
            char_array[i] = aoc[i];
        }
        return char_array;

    }

    /*
        Return true if s1 is an anagram of s2. That is they contain the same letters.
        For example "angered" and "enraged" are anagrams.
        Hint: Use make_array, Arrays.sort, and Arrays.equals directly.
     */
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char [] chi = s1.toCharArray();
        char [] town = s2.toCharArray();
        Arrays.sort(chi);
        Arrays.sort(town);


        return Arrays.equals(chi, town);

    }

    /*
      Write a method  numDifferent that takes a sorted array of integers as a parameter and
      returns the number of different values in the array. You can assume the array is in
      sorted order. This means that duplicates will be next to each other. For example, if a
      variable nums stores the following values:
         int [] nums = {3, 5, 5, 5, 8, 21, 21, 23, 34, 39, 39, 40, 40, 40, 41};
      then the call of numDifferent(nums) should return 9 because this list has 9 unique
      values (3, 5, 8, 22, 23, 34, 39, 40 and 41). It is possible that the list might
      not have any duplicates. For example if list instead stored this sequence of values:
        int [] nums = {1, 2, 11, 17, 19, 20, 23, 24, 25, 26, 31, 34, 37, 40, 41};
       numDifferent(nums) would return 15 because this list contains 15 different values.
     */
    public static int numDifferent(int [] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 1;
         for (int i = 0; i < nums.length - 1; i++) {
             if (nums[i] != nums[i + 1]) {
                 count++;
             }
         }

        return count; // shut up error message
    }

    public static void main(String[] args) {
        String [] names = {"Harry", "Ron", "Draco", "Draco", "Hermione"};
        String [] fruit = {"apple", "pear", "banana", "apple", "orange", "guava"};
        System.out.println(hasAdjacent(names));
        System.out.println(!hasAdjacent(fruit));
        System.out.println(hasDuplicate(names));
        System.out.println(hasDuplicate(fruit));
        System.out.println(!hasDuplicate(new String [] {"baseball", "hockey", "soccer", "football"}));

        int [] values = {2,7,11,15};
        System.out.println(goofy(values, 26));
        System.out.println(!goofy(values, 5));

        System.out.println(Arrays.equals(make_array("hello"),
                new char [] {'h','e','l','l','o'}));

        System.out.println(isAnagram("angered", "enraged"));
        System.out.println(!isAnagram("pizza", "sauce"));

        int [] nums = {3, 5, 5, 5, 8, 21, 21, 23, 34, 39, 39, 40, 40, 40, 41};
        System.out.println(numDifferent(nums) == 9);

        int [] nums2 = {1, 2, 11, 17, 19, 20, 23, 24, 25, 26, 31, 34, 37, 40, 41};
        System.out.println(numDifferent(nums2) == 15);
    }
}
