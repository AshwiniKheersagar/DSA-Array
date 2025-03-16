package longest_substring;

import java.util.HashSet;
import java.util.Set;

public class Brute {

    public static void main(String[] args) {
        String str="adcaabcdba";
        int len=solve(str);
        System.out.println("Max Length is:"+len);

    }
        
    private static int solve(String str) {
        // TODO Auto-generated method stub
            
        int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++)
        {
            Set<Character> st=new HashSet<>();
            for(int j=i;j<str.length();j++)
            {
                if(st.contains(str.charAt(j)))
                {
                   maxlen=Math.max(maxlen, j-i);
                   break;
                }
                st.add(str.charAt(j));
            } 
        }
        return maxlen;
    }
}