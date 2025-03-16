package pascal_Triangle;

public class Variation1 {

    static int nCr(int n ,int r)
    {
        long res=1;
        for(int i=0;i<r;i++)
        {
           res=res*(n-i);
           res=res/(i+1);
        }
        return (int)res;
    
    }
    public static void main(String[] args) 
    {
       //1.Give row and column tell the element at that place
       /*
              1
           1     1
        1     2     1
     1     3     3      1    */

     int r=3,c=2;  
     int value=  nCr(r-1,c-1);
     
     System.out.println(value);

    }
}
