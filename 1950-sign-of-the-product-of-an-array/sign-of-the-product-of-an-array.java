class Solution {
    public int arraySign(int[] nums) {
        int negative =0;
        int positive =0;
        for (int num : nums) {
            if(num ==0){
                return 0;
            }
            else if(num<0){
                negative++;
            }
        }
        if (negative %2 ==1){
            return -1;
        }else{
            return 1;
        }
    }
}