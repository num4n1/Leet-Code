class Solution 
{
    public int[] rotate(int[] nums, int k) 
    {
       int check;
        for(int i=0; i<k;i++)
        {
            int new_length = nums.length;
            check = nums[new_length-1];
            
            for(int j=new_length-1; j>0 ;j--)
            {
                nums[j]=nums[j-1];
            }
            
            nums[0]=check;
        }
      return nums;
    }
}
