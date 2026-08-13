import java.util.*;
public class bruteleaders {
    public static void main(String[] args) {
        
        // int arr[]={10,22,12,3,0,6};
        int arr[]={5,4,3,2,1};
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader=true;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader==true){
                ans.add(arr[i]);
            }
        }
        System.out.println(ans);
    }
}
//tc: near about O(N^2)
//no extra space but we have used to store the array which can be at wosrst would be O(N)