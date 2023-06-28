package LittlePrograme;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1twoSum {
    public static void main(String[] args) {
        LC1twoSum lc1 = new LC1twoSum();
        int[] ans = lc1.twoSum(new int[]{2,5,5,11},10);
        for (int i :
                ans) {
            System.out.print(i+",");
        }
    }

    /*
    执行用时：
128 ms
, 在所有 Java 提交中击败了
5.19%
的用户
内存消耗：
38.6 MB
, 在所有 Java 提交中击败了
54.20%
的用户
*/
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length-1; i++) {
            for(int j =i+1 ; j<nums.length;j++) {
              if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

/*
* 执行用时：
2 ms
, 在所有 Java 提交中击败了
52.17%
的用户
内存消耗：
38.7 MB
, 在所有 Java 提交中击败了
40.65%
的用户
炫耀一下:

写题解，分享我的解题思路
提交结果	执行用时	内存消耗	语言	提交时间	备注
通过
2 ms	38.7 MB	Java	2021/06/25 15:46
添加备注

通过
2 ms	38.8 MB	Java	2021/06/25 15:46
添加备注

通过
2 ms	38.4 MB	Java	2021/06/25 15:46
添加备注

通过
2 ms	38.5 MB	Java	2021/06/25 15:46
添加备注
* */
    //MethodTwo hashTable
    public int[] twoSumHashTable(int[] nums, int target) {
            Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; ++i) {
                if (hashtable.containsKey(target - nums[i])) {
                    return new int[]{hashtable.get(target - nums[i]), i};
                }
                hashtable.put(nums[i], i);
            }
            return new int[0];
        }

}


