



public class BuyAndSell_Stock {
    public static void BuyandSell(int[] arr){
        int buyingPrice = Integer.MAX_VALUE ; // To minimize the Buying Price
        int maxProfit = 0 ; 
        int buyday = -1 ; // Keep Track of the day
        int sellday = -1 ; 
        int tempbuyday = -1;
        for(int i=0 ; i<arr.length ; i++){
            if(buyingPrice>arr[i]){
                buyingPrice = arr[i];
                tempbuyday = i ; 
            } else {
                int profit = arr[i] - buyingPrice ; 
                if(profit>maxProfit){
                    maxProfit = profit ; 
                    buyday = tempbuyday ; 
                    sellday = i ; 
                }
            }
        }
        if(maxProfit>0){
            System.out.println("The Best Day to Buy is : Day " + (buyday+1));
            System.out.println("The Best Day to Sell is : Day "+(sellday+1));
        }
        else {
        System.out.println("NO profit Possible !");
        }
    }
}
