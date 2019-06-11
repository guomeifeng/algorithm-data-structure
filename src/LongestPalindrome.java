
import static java.lang.System.console;
import java.util.ArrayList;

//Given a string s, find the longest palindromic substring in s. You may assume that 
//the maximum length of s is 1000.
//
//Example 1:
//
//Input: "babad"
//Output: "bab"
//Note: "aba" is also a valid answer.
//Example 2:
//
//Input: "cbbd"
//Output: "bb"
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        
        int length = s.length();
        if (length==1) return s;
        for (int i=0;i<length/2;i++){
            if (!s.substring(i,i+1).equals(s.substring(length-i-1, length-i))){
                String s1 = longestPalindrome(s.substring(1,length));
                String s2 = longestPalindrome(s.substring(0,length-1));
                return "";
//                return s1.length()>s2.length()?s1:s2;
            }
        }
        return s;
    }
    
    public static void main(String[] args){
        LongestPalindrome test = new LongestPalindrome();
        String s = test.longestPalindrome("babaddtattarrattatd");
        System.out.println(s);
    }
}
