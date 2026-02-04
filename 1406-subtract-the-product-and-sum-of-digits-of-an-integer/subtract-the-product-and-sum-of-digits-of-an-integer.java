class Solution {
    public int subtractProductAndSum(int n) {
        int productDigits = 1;
        int sumDigits =0;
        int temp =n;
        while(temp > 0){
            int lastDigit = temp %10;
            productDigits *= lastDigit;
            sumDigits +=lastDigit;
            temp /=10;
        }
        return productDigits - sumDigits;
    }
}