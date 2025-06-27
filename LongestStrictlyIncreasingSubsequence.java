// Given an array arr[] of non-negative integers, the task is to find the length of the Longest Strictly Increasing Subsequence (LIS).

// A subsequence is strictly increasing if each element in the subsequence is strictly less than the next element.

// Examples:

// Input: arr[] = [5, 8, 3, 7, 9, 1]
// Output: 3
// Explanation: The longest strictly increasing subsequence could be [5, 7, 9], which has a length of 3.
// Input: arr[] = [0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15]
// Output: 6
// Explanation: One of the possible longest strictly increasing subsequences is [0, 2, 6, 9, 13, 15], which has a length of 6.
// Input: arr[] = [3, 10, 2, 1, 20]
// Output: 3
// Explanation: The longest strictly increasing subsequence could be [3, 10, 20], which has a length of 3.
// Constraints:
// 1 ≤ arr.size() ≤ 103
// 0 ≤ arr[i] ≤ 106

class Solution {
    static int lis(int arr[]) {
        // Binary search approach
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();

        // Initialize the answer list with the
        // first element of arr
        ans.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] > ans.get(ans.size() - 1)) {
                // If the current number is greater
                // than the last element of the answer
                // list, it means we have found a
                // longer increasing subsequence.
                // Hence, we append the current number
                // to the answer list.
                ans.add(arr[i]);
            } else {
                // If the current number is not
                // greater than the last element of
                // the answer list, we perform
                // a binary search to find the smallest
                // element in the answer list that
                // is greater than or equal to the
                // current number.

                // The binarySearch method returns
                // the index of the first element that is not less than
                // the current number.
                int low = Collections.binarySearch(ans, arr[i]);

                // We update the element at the
                // found position with the current number.
                // By doing this, we are maintaining
                // a sorted order in the answer list.
                if (low < 0) {
                    low = -(low + 1);
                }
                ans.set(low, arr[i]);
            }
        }

        // The size of the answer list
        // represents the length of the
        // longest increasing subsequence.
        return ans.size();
    }
}
