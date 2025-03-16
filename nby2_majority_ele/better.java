package nby2_majority_ele;

import java.util.HashMap;
import java.util.Map;

public class better {
    public static void main(String[] args) 
    {
        int[] arr={2,2,3,3,1,2,2};
        int n=arr.length;

        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < n; i++) 
        {
            int value=map.getOrDefault(arr[i],0);
            map.put(arr[i], value+1);
        }

        for (Map.Entry<Integer,Integer> i : map.entrySet()) 
        {
            if(i.getValue()>n/2)
            {
                System.out.println("The majority element is: "+i.getKey());
                break;
            }
        }
    }
}
