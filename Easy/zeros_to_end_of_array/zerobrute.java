import java.util.ArrayList;
public class zerobrute {
    
    public static void main(String[] args) {
        
        int arr[] ={1,0,2,0,0,3,0,0,4,5,6,0,0,0,7,7};
        
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        
        int nz=temp.size();
        for(int i=0;i<nz;i++){
            arr[i]=temp.get(i);
        }
        
        for(int i=nz;i<arr.length;i++){
            arr[i]=0;
        }
        for(int num: arr){
            System.out.print(num);
        }
        
    }
}