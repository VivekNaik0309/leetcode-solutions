public class  brutearrange {
     public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        
        int arr[]={3,1,-2,-5,2,-4};
        int n=arr.length;
        int pos[]=new int[n/2];
        int neg[]=new int[n/2];
        int plus=0;
        int minus=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos[plus]=arr[i];
                plus++;
            }
            else{
                neg[minus]=arr[i];
                minus++;
            }
        }
        // for(int num: pos){
        //     System.out.print(num+ " ");
        // }
        
        // for(int num: neg){
        //     System.out.print(num+ " ");
        // }
        //     System.out.println();
        
        for(int i=0;i<n/2;i++){
            arr[2*i]=pos[i];
            arr[2*i+1]=neg[i];
        }
        // for(int num: arr){
        //     System.out.print(num+ " ");
        // }
        
    }
}
