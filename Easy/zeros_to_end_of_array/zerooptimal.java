public class zerooptimal {
    
    public static void main(String[] args) {
        
        int arr[] ={1,0,2,0,0,3,0,0,4,5,6,0,0,0,7,7};
        
        int j=-1;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int num : arr){
            System.out.print(num);
        }
        
    }
}