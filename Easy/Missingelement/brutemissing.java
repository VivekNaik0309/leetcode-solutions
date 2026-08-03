public class brutemissing {
    public static void main(String[] args) {
        
        int arr[]= {1,2,3,5};
        int n=5;
        
        for(int i=1;i<=n;i++){
            boolean found= false;
            
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                found=false;
                System.out.println("not present number = "+i);
            }
        }
        
    }
}