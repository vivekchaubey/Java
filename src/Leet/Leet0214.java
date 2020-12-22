/*
Given a string s, you can convert it to a palindrome by adding characters in front of it. Find and return the shortest palindrome you can find by performing this transformation.



Example 1:

Input: s = "aacecaaa"
Output: "aaacecaaa"
Example 2:

Input: s = "abcd"
Output: "dcbabcd"
* */
package Leet;

public class Leet0214 {
    public String shortestPalin(String s){
        StringBuilder sb=new StringBuilder(s);
        int i=0,j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                sb.insert(j+1,s.charAt(i));
                j++;
            }
            i++;
            j--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="abcd";
        Leet0214 l=new Leet0214();
        String o=l.shortestPalin(s);
        System.out.println(o);
    }
}
