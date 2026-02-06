class Solution {
    public int removeDuplicates(int[] nums) {
        int k =1;
        int a =0;

        for(int i =1; i< nums.length;i++){    
            if(nums[a] != nums[i]){
                nums[a+1] = nums[i];
                k++;
                a++;
            }

        }
        return k;
    }
}