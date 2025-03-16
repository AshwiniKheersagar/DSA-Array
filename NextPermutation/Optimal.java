package NextPermutation;


public class Optimal {

    static void reverse (int[] arr, int start,int end)
    {
       while(start<end){
        swap(arr,start,end);
        start++;
        end--;
       }
    }

   static void swap(int[] arr,int i,int j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
   }
    static void printSArray(int[] arr)
    {
        System.out.println("The matrix is :");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,4,3,0,0};
        int n=arr.length;

        int index=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                index=i;
                break;
            }
        }

        if(index==-1){
            reverse(arr,0,n-1);
        }
        
        for(int i=n-1;i>index;i--)
        {
            if(arr[i]>arr[index])
            {
               swap(arr, index, i);
               break; 
            }
        }

        reverse(arr, index+1,n-1);

        printSArray(arr);
    }
}
