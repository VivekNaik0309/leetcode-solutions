// brute time complexity is O(n+d) and space complexity is O(d)=because we use extra temp variable
public class brutedrotate {
    
    public static void leftd(int arr[],int d){
        d=d%arr.length;
        int temp[]=new int[d];

        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }

        for(int i = d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }

        for (int i = arr.length - d; i < arr.length; i++) {
            arr[i] = temp[i - (arr.length - d)];
        }

        for(int num: arr){
            System.out.print(num);
        }
    }
     public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d =3;
       leftd(arr,d);
       
    }      

}