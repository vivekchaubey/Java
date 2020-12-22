/*
Given a string s, partition s such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of s.



Example 1:

Input: s = "aab"
Output: 1
Explanation: The palindrome partitioning ["aa","b"] could be produced using 1 cut.
Example 2:

Input: s = "a"
Output: 0
Example 3:

Input: s = "ab"
Output: 1

* */
package Leet;

public class Leet0132 {
    public boolean palinCheck(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public int splitCount(String s) {
        int count=10000000;
        if(palinCheck(s)){
            return 0;
        }else if(s.length()==1){
            return 0;
        }else{
            for(int i=1;i<s.length();i++){
                int temp=0;
                String left=s.substring(0,i);
                String right=s.substring(i);
                int leftC=splitCount(left);
                int rightC=splitCount(right);
                temp=leftC+rightC+1;
                if(temp<count){count=temp;}
            }
        }
        System.out.println("FINAL: "+count);
        return count;
    }

    public static void main(String[] args) {
        String s="aba";
        Leet0132 l=new Leet0132();
        int t=l.splitCount(s);
        System.out.println(t);
    }
}
