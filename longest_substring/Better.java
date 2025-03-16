package longest_substring;

import java.util.*;

public class Better 
{
    public static void main(String[] args) {
        String str="adcaabcdba";
        int len=solve(str);
                System.out.println("Max Length is:"+len);
        
        }
        
        private static int solve(String str) {
            // TODO Auto-generated method stub
            int l=0;
            if(str.length()==0)
            {
                return 0;
            }
            int maxlen=Integer.MIN_VALUE;
            Set<Character> st=new HashSet<>();
            
            for(int r=0;r<str.length();r++)
            {
                if(st.contains(str.charAt(r)))
                {
                    while (l<r && st.contains(str.charAt(r))) 
                    {
                       st.remove(str.charAt(l));
                       l++;
                    }
                }
                st.add(str.charAt(r));
                maxlen=Math.max(maxlen, r-l+1);
            }
           return maxlen;
        }

}
