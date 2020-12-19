/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn]

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
* */
package Leet;

import java.util.Arrays;

public class Leet1470 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        System.out.println(Arrays.toString(arr));

        int left=1;
        int right=n/2;
        int counter=1;
       for(int i=right;i<n-1;i++){
           System.out.println("STEP: "+counter);
           int temp=arr[left];
           arr[left]=arr[i];
           for(int j=i-1;j>=left+1;j--){
               arr[j+1]=arr[j];
           }
           arr[left+1]=temp;
           System.out.println(Arrays.toString(arr));
           left+=2;
           counter+=1;
           System.out.println("####################################");
       }
    }
}
