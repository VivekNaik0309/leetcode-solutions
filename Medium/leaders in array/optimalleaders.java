import java.util.*;
public class optimalleaders {
    public static void main(String[] args) {
        
        int arr[]={10,22,12,3,0,6};
        
        ArrayList<Integer> ans = new ArrayList<>();
        int maxi=0;
        for(int i=arr.length-1;i>=0;i--){

            if(arr[i]>maxi){
                maxi=arr[i];
                ans.add(arr[i]);
            }
        }
        System.out.print(ans);
    }
}
//tc=O(N)
//sc=we have used arraylist just to return so in worst case if everyone is leader than O(N)