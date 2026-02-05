class Solution {
    public int calPoints(String[] operations) {
        List<Integer> records = new ArrayList<>();
        int sumOfAll = 0;

        for(String operation: operations){    
            if(operation.equals("+")){
                int sum = records.get(records.size()-2) + records.get(records.size()-1);
                records.add(sum);
            }else if(operation.equals("D")){
                int product = records.get(records.size()-1) *2;
                records.add(product);
            }else if(operation.equals("C")){
                records.remove(records.size()-1);
            }else{
                records.add(Integer.parseInt(operation));
            }
        }
                
        for (int record : records) {
            sumOfAll += record;
        }
        return sumOfAll;

    }
}