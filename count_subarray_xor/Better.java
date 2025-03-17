package count_subarray_xor;

public class Better {

    public static void main(String[] args) {
        int[] arr={4,2,2,6,4};
        int K=6;
        int cnt=0;

        for (int i = 0; i < arr.length; i++) {
            int xor=0;
            for (int j = i; j < arr.length; j++) 
            {
                xor=xor^arr[j];
                if(xor==K) cnt++;
            }
            
        }
        System.out.println("Count: "+cnt);
    }
    
}
