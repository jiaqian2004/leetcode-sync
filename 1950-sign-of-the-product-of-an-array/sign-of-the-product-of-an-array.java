class Solution {
    public int signFunc(int x) {        
        if (x %2 ==1){
            return -1;
        }else{
            return 1;
        }
    }
    public int arraySign(int[] nums) {
        int negative =0;
        for(int i =0; i<nums.length;i++){
            if(nums[i] ==0){
                return 0;
            }
            else if(nums[i]<0){
                negative++;
            }
        }
        return signFunc(negative);
    }
}