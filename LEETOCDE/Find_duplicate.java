// 287. Find the Duplicate Number
// Medium
// 20.2K
// 3.2K
// Companies
// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

 

// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2
// Example 2:

// Input: nums = [3,1,3,4,2]
// Output: 3
 

// Constraints:

// 1 <= n <= 105
// nums.length == n + 1
// 1 <= nums[i] <= n
// All the integers in nums appear only once except for precisely one integer which appears two or more times.
 

// Follow up:

// How can we prove that at least one duplicate number must exist in nums?
// Can you solve the problem in linear runtime complexity?

package LEETOCDE;

public class Find_duplicate {
    class Solution {
        public int findDuplicate(int[] nums) {
    
            // not applicable on element > nums.length will cause AOB exception
                int slow = 0, fast = 0; //fast and slow poimter
        // creation of nodes until they meet
        do{
         slow = nums[slow];
         fast = nums[nums[fast]];
    
        }while(fast!=slow);
    
        slow = 0;
         while(slow!=fast){
             fast=nums[fast];
                slow=nums[slow];
            }
            
            return slow;
    
        }
    }
    
}
