/*
 * 1979. Find Greatest Common Divisor of Array
Easy
949
37
Companies
Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

 

Example 1:

Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.
Example 2:

Input: nums = [7,5,6,8,3]
Output: 1
Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.
Example 3:

Input: nums = [3,3]
Output: 3
Explanation:
The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.
 * 
*/
package LEETOCDE;

public class Eluclid_ {
    class Solution {
        public int findGCD(int[] nums) {
             int a = Integer.MIN_VALUE, b = Integer.MAX_VALUE;
            for(int num : nums) {
                a = Math.max(a, num);
                b = Math.min(b, num);
            }
            int A,B;
            while(a!=0) {
               A= b%a;
               B=a;
               a = A;
               b = B;
            }
            return b;
        }
    }
}
