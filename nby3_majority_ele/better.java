package nby3_majority_ele;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class better 
{
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 2, 2 , 2};
        int n = arr.length;

        List<Integer> ls= new ArrayList<>();

        HashMap<Integer,Integer> mpp=new HashMap<>();

        int mini=(int)(n/3)+1;

        for (int i = 0; i < n; i++) 
        {
           int value=mpp.getOrDefault(arr[i], 0);
           
           mpp.put(arr[i],value+1);

           if(mpp.get(arr[i])==mini)
           {
              ls.add(arr[i]);
           }

           if(ls.size()==2) break;
        }

        System.out.println(ls);
    }
}
