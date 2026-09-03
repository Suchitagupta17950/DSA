class Solution {
    public boolean uniformArray(int[] nums1) {

        int minOdd = Integer.MAX_VALUE;

        for (int num : nums1) {
            if (num % 2 != 0) {
                minOdd = Math.min(minOdd, num);
            }
        }

        // No odd number
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }

        // Every even number must be greater than
        // some smaller odd number.
        for (int num : nums1) {
            if (num % 2 == 0 && num < minOdd) {
                return false;
            }
        }

        return true;
    }
}