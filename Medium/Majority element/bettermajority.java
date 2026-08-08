import java.util.HashMap;
import java.util.Map;
public class bettermajority {
    public static void main(String[] args) {
        int arr[]={2,2,2,1,5,1,5,2};
        int n=arr.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1) ;   
        }
        
        System.out.println(map);
        
        for(Map.Entry<Integer,Integer> map1 : map.entrySet()){
            if(map1.getValue()>(n/2)){
                
                System.out.println(map1.getKey());
                return;
            }
         }
         System.out.println(-1);
    }
}