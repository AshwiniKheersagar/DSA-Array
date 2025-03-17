package count_subarray_xor;

import java.util.*;

public class Optimal 
{
    public static void main(String[] args) {
        
        int[] arr={4,2,2,6,4};
        int n=arr.length;
        int K=6;

        int xr=0;
        Map<Integer,Integer> map=new HashMap<>();

        map.put(xr,1);
        int cnt=0;

        for (int i = 0; i < n; i++) 
        {
            xr=xr^arr[i];
            int x=xr^K;
            
            if(map.containsKey(x))
            {
                cnt+=map.get(x);
            }
            if(map.containsKey(xr))
            {
                map.put(xr, map.get(xr)+1);
            }
            else
            {
                map.put(xr,1);
            }
        }
        
        System.out.println("Count:"+cnt);
    }
}
