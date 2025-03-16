package duplicate_number;

public class hashing {
    
    public static void main(String[] args) 
    {
        int[] arr={2,5,9,6,9,3,8,9,7,1};

        int n=arr.length;

        int[] freq=new int[n];

        for (int i = 0; i < arr.length; i++) 
        {
            if(freq[arr[i]]==0 )
            {
                freq[arr[i]]++;               
            }
            else
            {
                System.out.println("The duplicate is "+ arr[i]);
                break;
            }
        }
    }
}
