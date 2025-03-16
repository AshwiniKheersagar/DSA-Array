package set_matrix_zero;
public class Better {
    public static void main(String[] args) {
        int[][] arr={{1,1,1,1},{1,0,1,1},{1,1,0,1},{1,0,0,1}};
        int n=arr.length,m=arr[0].length;
        int[] row = new int[n];
        int[] col = new int[m];

        Function arrPrint =new Function();
        arrPrint.printArray(arr);
        arrPrint.printSArray(row);
        arrPrint.printSArray(col);
        

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j]=0;
                }
            }
        }
        
        arrPrint.printArray(arr);
    }
}
