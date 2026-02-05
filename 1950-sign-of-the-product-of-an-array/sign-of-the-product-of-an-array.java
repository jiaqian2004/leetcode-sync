class Solution {
    public int signFunc(int x) {        
        if (x > 0) return 1;
        if (x < 0) return -1;
        return 0;
    }
    public int arraySign(int[] nums) {
        int negative =1;
        for (int num : nums) {
            if(num ==0){
                return signFunc(0);
            }
            else if(num<0){
                negative = -negative;
            }
        }
        return signFunc(negative);
    }
}