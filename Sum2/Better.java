package Sum2;

import java.util.*;

public class Better 
{
    public static void main(String[] args) 
    {
        int[] arr={2,6,5,8,11};
        int target=10;
        int n=arr.length;

        List<Integer> ls=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) 
        {
            int num=arr[i];
            int moreNeeded=target-num;
            if(map.containsKey(moreNeeded))
            {
               ls.add(i);
               ls.add(map.get(moreNeeded));
            }
            map.put(num, i);
        }

        System.out.println(ls);
    }
}
