class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumOfSingle = 0;
        int sumOfDouble =0;
        
        for(int num:nums){
            if(num >=10){
                sumOfDouble+=num;
            }else if (num<10){
                sumOfSingle+=num;
            }else{
                return false;
            }
        }
        return sumOfDouble != sumOfSingle;

    }
}