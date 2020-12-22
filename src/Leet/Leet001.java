/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

* */
package Leet;

public class Leet001 {
    public static void main(String[] args) {
        int[] num={2,7,11,15};
        int target=13;

        for(int i=0;i<num.length;i++){
            if(num[i]<target){
                for(int j=i+1;j<num.length;j++){
                    if(num[j]<target){
                        int sum=num[i]+num[j];
                        if(sum==target){
                            System.out.println("Indexes are "+i+","+j);
                            System.exit(0);
                        }
                    }
                }
            }
        }
        System.out.println("no relevant pair");
    }
}
