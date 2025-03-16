package sumOf3;

import java.util.*;

public class Brute 
{
    public static void main(String[] args) 
    {
        int[] arr={-1,0,1,2,-1,-4};

        Set <List<Integer>> st=new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) 
        {
             for (int j = i+1; j < arr.length; j++) 
             {
                 for (int k = j+1; k < arr.length; k++) {
                    
                    if (arr[i]+arr[j]+arr[k]==0) 
                    {
                       List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k]);
                       
                       Collections.sort(temp);
                       st.add(temp);
                       
                    }

                 }
             }
        }

        for (List<Integer> list : st) {
            System.out.println(list);
        }
    }
}
