
public class bettermaxsub {
    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int n = arr.length;
        int maxi=0;
       for(int i=0;i<n;i++){
           int sum=0;
           for(int j=i;j<n;j++){
               sum+=arr[j];
               maxi=Math.max(sum,maxi);
           }
       }
       System.out.println(maxi);
    }
}