public class Linear {
    
    public static void main(String[] args) {
        
        int arr[] ={1,0,2,0,0,3,0,0,4,5,6,0,0,0,7,7};
        int n=arr.length;
        int target=4;
        for(int i=0;i<n;i++){
            if(target==arr[i]){
                System.out.println("Found at index "+i);
            }
        }
    }
    
}
