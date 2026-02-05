class Solution {
    public int signFunc(int x) {        
        if (x > 0) return 1;
        if (x < 0) return -1;
        return 0;
    }
    public int arraySign(int[] nums) {
        int negative =1;
        for(int i =0; i<nums.length;i++){
            if(nums[i] ==0){
                return 0;
            }
            else if(nums[i]<0){
                negative *= -1;
            }
        }
        return signFunc(negative);
    }
}