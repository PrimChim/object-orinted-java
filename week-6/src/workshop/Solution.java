package workshop;

public class Solution {
    public int maxProfit(int prices[]) {
        int profit = 0,flag = 2;
        if(prices.length == 1){
            return 0;
        }
        for(int i = 0; i<prices.length;i++){
        	
            if(i!=flag){
            	System.out.println(i);
                if(i==flag-2){
                    profit -= prices[i];
                }else{
                    profit += prices[i];
                }
            }else{
            	System.out.println("else");
                flag+=3;
            }
        }
        return profit;
    }
    
    public static void main(String[] args){
        int arr[] = {1,2,3,0,2};
        Solution sol = new Solution();
        sol.maxProfit(arr);
    }
}