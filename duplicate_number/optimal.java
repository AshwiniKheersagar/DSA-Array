package duplicate_number;

public class optimal {

    public static void main(String[] args) 
    {
        int[] nums={2,5,9,6,9,3,8,9,7,1};

        int slow=nums[0];
        int fast=nums[0];

        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);

        fast=nums[0];

        while (slow!=fast) 
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        System.out.println("The missing number is:"+fast);

    }
}