package LittlePrograme;


public class LC27RemoveElement {
    public int removeElement(int[] nums, int val) {
        for (int i :
                nums) {
          //  nums.
        }
        return val;
    }


    public int LCremoveElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
