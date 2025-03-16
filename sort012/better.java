package sort012;

public class better {

    static void printSArray(int[] arr)
    {
        for (int i : arr) 
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) 
    {
        int arr[]={0,1,2,0,1,2,0,1};

        int cnt0=0;
        int cnt1=0;
        int cnt2=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] ==0)
            {
               cnt0++;
            }
            else if(arr[i]==1)
            {
                cnt1++;
            }
            else if(arr[i]==2)
            {
                cnt2++;
            }
        }

        for(int i=0;i<cnt0;i++)
        {
            arr[i]=0;
        }
        for(int j=cnt0;j<(cnt0+cnt1);j++){
            arr[j]=1;
        }
        for(int k=cnt0+cnt1;k<arr.length;k++){
           arr[k]=2;
        }

        printSArray(arr);
    }
}
