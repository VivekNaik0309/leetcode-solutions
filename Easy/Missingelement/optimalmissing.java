//  //Using Sum
//  public class optimalmissing {
//     public static void main(String[] args) {

//         int arr[] = {1, 2, 3, 5};
//         int n = 5;

//         int sum=(n*(n+1))/2;
//         int sum2=0;
//         for(int i=0;i<arr.length;i++){
//             sum2+=arr[i];
//         }
//         System.out.println(sum-sum2);    
//     }
// }

//using xor function
 public class optimalmissing {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5};
        int N = 5;
        int n=N-1;

       int xor1=0,xor2=0;
       
       for(int i=0;i<n;i++){
           xor2=xor2^arr[i];
           xor1=xor1^(i+1);
       }
       xor1=xor1^N;
        System.out.println(xor1^xor2);
    }
}