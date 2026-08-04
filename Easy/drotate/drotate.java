

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