public class optimalmaxsub {
    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int n = arr.length;

        int sum = 0;
        int max = Integer.MIN_VALUE;

        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;

        for (int i = 0; i < n; i++) {

            if (sum == 0) {
                start = i;
            }

            sum = sum + arr[i];

            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Maximum Sum = " + max);
        System.out.println("Start Index = " + ansStart);
        System.out.println("End Index = " + ansEnd);

        System.out.println("Subarray:");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//code to understand
// import java.util.*;

// public class bettermaxsub {
//     public static void main(String[] args) {

//         int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

//         int n = arr.length;
        
//         int sum=0;
//         int maxi=Integer.MIN_VALUE;
        
//         for(int i=0;i<n;i++){
//             sum+=arr[i];
            
//             if(sum>maxi){
//                 maxi=sum;
//             }
//             if(sum<0){
//                 sum=0;
//             }
                
//         }
//            System.out.println(maxi);
//     }
// }