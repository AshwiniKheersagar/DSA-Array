package set_matrix_zero;
public class Brute {
    public static void markRow(int i,int[][] arr)
    {
        for(int j=0;j<arr[0].length;j++)
        {
           if(arr[i][j]!=0)
           {
            arr[i][j]=-1;
           }
        }
    }

    public static void markCol(int j,int[][] arr)
    {
        for(int i=0;i<arr[0].length;i++)
        {
           if(arr[i][j]!=0)
           {
            arr[i][j]=-1;
           }
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};

        Function arrPrint =new Function();
        arrPrint.printArray(arr);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    markRow(i,arr);
                    markCol(j,arr);
                }
            }
        }
        arrPrint.printArray(arr);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }

        arrPrint.printArray(arr);
        
    }
   
}
