package pascal_Triangle;

public class Variation2 {
    public static void main(String[] args) {
        int row=3;

        int ans=1;
        System.out.print(ans+" ");
        for(int col=1;col<row;col++)
        {
            ans=ans*(row-col);
            ans=ans/col;
            System.out.print(ans+" ");
        }
    }
}
