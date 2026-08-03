public class betteronce {
    public static void main(String[] args) {

        int arr[] = {1,1,2,3,3,4,4,5,5};
       
        int maxi =0;
        //finding the max value in the array
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(arr[i],maxi);
        }

        //always use this when doing hashing
        int hash[]=new int[maxi+1];
        
        //counting the frequency
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]=hash[arr[i]]+1;
        }

        //print the found value and use return otherwise it will show arrayofindex
        for(int i=0;i<arr.length;i++){
            if(hash[i]==1){
                System.out.println(i);
                return;
            }
        }
    }
} 
//time complexity will be we have used 3 for loops so O(N)+O(N)+O(N)= O(3n)
//space complexity we have used hash maxi so O(maxi) that depends on the input    

