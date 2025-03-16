package sumOf3;

import java.util.*;

public class Better 
{
     public static void main(String[] args) 
     {
        int [] arr={-1,0,1,2,-1,-4};

        Set<List<Integer>> st=new HashSet<>();

        for (int i = 0; i < arr.length; i++) 
        {
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<arr.length;j++)
            {
                int third=-(arr[i]+arr[j]);

                if(set.contains(third))
                {
                    List<Integer> temp=Arrays.asList(arr[i],arr[j],third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                set.add(arr[j]);
            }
        }

        for (List<Integer> list : st) {
            System.out.println(list);
        }  
     }
}
