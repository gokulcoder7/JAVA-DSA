
      int[] nums={5,7,2,8,55,4};
      int target=8;


            int l = 0, r = nums.length;
            while (l < r) {
                int m = (l + r) / 2;
                if (nums[m] < target) l = m + 1;
                else r = m;
            }


            System.out.println(l);





// If the target exists, returns its leftmost index.
// Else, returns the index of where it should be.
int binarySearch(int[] nums, int target) {
    int l = 0, r = nums.length;
    while (l < r) {
        int m = (l + r) / 2;
        if (nums[m] < target) l = m + 1;
        else r = m;
    }
    return l;
}
