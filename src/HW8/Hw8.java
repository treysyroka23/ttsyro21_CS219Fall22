package HW8;
import java.util.Arrays;
public class Hw8 {
    /*
     *   Return the sum of the array of integers starting at index i up
     *   to the end of the array.  Assume i >= 0.
     *
     *   Write this recursively. Do not use a loop.
     */
    public static int sum(int [] aoi, int i) {
        if (i == aoi.length - 1) {
            return aoi[i];
        }


        return aoi[i] + sum(aoi, i + 1);
    }


    // Swap items at position i and j in aos.
    public static void swap(int [] aos, int i, int j) {
        int temp = aos[i];
        aos[i] = aos[j];
        aos[j] = temp;
    }


    /*
     *   Reverse the array items in aoi between indexes i and j inclusive.
     *
     *   Write this recursively. Do not use a loop.
     */
    public static int [] reverse(int [] aoi, int i, int j) {
        if (i >= j) {
            return aoi;
        }
        int temp = aoi[i];
        aoi[i] = aoi[j];
        aoi[j] = temp;

        return reverse(aoi, i + 1, j - 1);
    }

    /*
     *   Count the number of times target appears in aoi starting
     *   at index i.
     *
     *   Write this recursively. Do not use a fruit loop.
     */
    public static int count(int [] aoi, int target, int i) {
        int temp = 0;
        if (target < 0) {
            return 0;
        }
        if (aoi[target] == i) {
            ++temp;
        }
        return (1+ count(aoi, target - 1, i));

    }

    public static void main(String [] args) {
        int [] nums = {4, 9, 1, 3, 2, 2, 9, 2};
        System.out.println(sum(nums, 0) == 32);
        System.out.println(sum(nums, 4) == 15);
        System.out.println(!(sum(nums, 7) == 0));

        System.out.println(Arrays.equals(
                reverse(nums, 0, nums.length - 1),
                new int [] {2,9,2,2,3,1,9,4}
        ));

        // Watchout! nums has been reversed

        System.out.println(Arrays.equals(
                reverse(nums, 2, 5),     // reverse the middle four numbers
                new int [] {2,9,1,3,2,2,9,4}
        ));

        System.out.println(count(nums, 2, 0) == 3);
        System.out.println(!(count(nums, 2, 13) == 0));
        System.out.println(count(nums, 2, 4) == 3);

    } // main

}
