
// public class brutelongestsub {
//     public static void main(String[] args) {
        
//         int arr[]= {1,2,3,1,1,1,4,2,3};
//         int n = arr.length;
//         int k=3;
        
//         int length=0;
//         for(int i=0;i<n;i++){
           
//             for(int j=i;j<n;j++){
//                 int sum=0;
                
//                 for(int q=i;q<=j;q++){
//                     sum+=arr[q];
//                 }
//                     if(sum==k){
//                         length=Math.max(length,j-i+1);
//                 }
//             }
//         }
//         System.out.println(length);
//     }
// }
//tc=O(N^3) 
//sc=not using any extra space
class Main {
    public static void main(String[] args) {
        
        int arr[]= {1,2,3,1,1,1,4,2,3};
        int n = arr.length;
        int k=3;
        
        int length=0;
        for(int i=0;i<n;i++){
           
                int sum=0;
            for(int j=i;j<n;j++){
                    sum+=arr[j];
                    if(sum==k){
                        length=Math.max(length,j-i+1);
                }
            }
        }
        System.out.println(length);
    }
}
//optimal brute approach tc=O(N^2)