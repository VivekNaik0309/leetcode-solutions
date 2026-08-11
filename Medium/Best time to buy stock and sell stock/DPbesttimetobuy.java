public class DPbesttimetobuy {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int n=prices.length;

        int mini=prices[0];
        int maxpro=0;

        for(int i=0;i<n;i++){
            int cost=prices[i]-mini;
            mini=Math.min(prices[i],mini);
            maxpro=Math.max(cost,maxpro);
        }
        System.out.println("Maximum profit is: "+maxpro);
        System.out.println("price to buy: "+mini);
    }
}
