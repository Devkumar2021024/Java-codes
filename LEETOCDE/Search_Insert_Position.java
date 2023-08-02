package LEETOCDE;

public class Search_Insert_Position {
    class Solution {
        int  p = 0;
        public int searchInsert(int[] nums, int target) {
        
         for(int i = 0; i<=nums.length -1; i++)
         {
            if(nums[i] == target)
            {
                p=i;
                break;
            }
            else if(nums[i] < target)
                   p = nums.length;
            else if(nums[i] > target){
                   p = i;
                   break;
            }                      
         } 
         return p;  
        }
    }
}
