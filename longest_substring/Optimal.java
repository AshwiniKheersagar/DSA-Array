package longest_substring;

import java.util.HashMap;

public class Optimal {
    public static void main(String[] args) {
        String str="adcaabcdba";
        int len=solve(str);
        System.out.println("Max Length is:"+len);
                
    }
        
    private static int solve(String str) 
    {
        HashMap<Character,Integer> map=new HashMap<>();

        int l=0,r=0;
        int len=0;

        while (r<str.length()) 
        {
            if(map.containsKey(str.charAt(r)))
            {
                l=Math.max(map.get(str.charAt(r))+1, l);
            }
            map.put(str.charAt(r), r);
            len=Math.max(r-l+1, len);
            r++;
        }
        return len; 
    }
}
