public class optimalrrange {
     public static void main(String[] args) {
        
        int arr[]={3,1,-2,-5,2,-4};
        int n=arr.length;
        int pos=0;
        int neg=1;
        
        int arr1[]= new int[n];
        
        for(int i =0;i<n;i++){
            if(arr[i]>0){
                arr1[pos]=arr[i];
                pos+=2;
            }
            else{
                arr1[neg]=arr[i];
                neg+=2;
            }
        }
        for(int num: arr1){
        System.out.print(num+" ");
            
        }
    }
}
