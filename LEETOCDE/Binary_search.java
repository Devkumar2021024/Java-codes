package LEETOCDE;

public class Binary_search {
    class Solution {
        public int search(int[] nums, int target) {
            int mid = (nums.length)/2;
            int p = 0;
            if(mid > 0){
            if(target == nums[mid])
                     p = mid;
            else if(target > nums[mid]){
                for(int i = mid+1; i<=nums.length-1; i++){
                    if(nums[i] == target){
                        p =i;
                        break;
                    }
                    else{
                p = -1;
            }
                }
            } 
            else if(target < nums[mid]){
                for(int i = 0; i<mid; i++){
                    if(nums[i] == target){
                        p =i;
                        break;
                    }
                    else{
                p = -1;
               }
                } 
            }
            else{
                p =-1;
            } 
            }
            else{
                if(target == nums[0])
                {
                    p = mid;
                }
                else{
                    p=-1;
                }
            }
            
            return p;       
        }
    }
}
