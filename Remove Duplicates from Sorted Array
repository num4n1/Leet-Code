class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        
        for(int i: nums)
        {
            if(index == 0 || i > nums[index - 1])
            {
                nums[index] = i;
                index++;
            }
        }
        return index;
    }
}
