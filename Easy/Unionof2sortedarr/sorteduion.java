import java.util.*;
public class sorteduion {
    
    public static void main(String[] args) {
        
        int a1[]={1,1,2,3,4,5};
        int a2[]={2,3,4,4,5,6};
        int n1=a1.length;
        int n2=a2.length;
        
        HashSet<Integer> set= new HashSet<>();
        
        for(int i=0;i<n1;i++){
            set.add(a1[i]);
        }
        for(int i=0;i<n2;i++){
            set.add(a2[i]);
        }
        
        ArrayList<Integer> union = new ArrayList<>();
        
        for(int num: set){
            union.add(num);
        }
        System.out.println(union);
    }
}