// brute time complexity is O(n+d) and space complexity is O(d)=because we use extra temp variable
// public class drotate {
    
//     public static void leftd(int arr[],int d){
//         d=d%arr.length;
//         int temp[]=new int[d];

//         for(int i=0;i<d;i++){
//             temp[i]=arr[i];
//         }

//         for(int i = d;i<arr.length;i++){
//             arr[i-d]=arr[i];
//         }

//         for (int i = arr.length - d; i < arr.length; i++) {
//             arr[i] = temp[i - (arr.length - d)];
//         }

//         for(int num: arr){
//             System.out.print(num);
//         }
//     }
//      public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7};
//         int d =3;
//        leftd(arr,d);
       
//     }      

// }

//optimal way time complexity is O(2n) and space complexity is O(1)=because we dont use extra temp variable
public class drotate {
    public static void reverse(int arr[],int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
    static void leftrotate(int arr[],int d,int n){
        d = d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    
    public static void main(String[] args) {
        
        int arr[] ={1,2,3,4,5,6,7};
        int n=arr.length;
        int d=3;
        leftrotate(arr,d,n);
        
        for(int num :arr){
            System.out.print(num);
        }
    }
}