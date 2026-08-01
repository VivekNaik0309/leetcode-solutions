public class Largest {
    public static void main(String args[]){
        int arr[] = {3,2,1,5,2};
        
        //Using Brute force=>Time Complexity:n log n , Space complexity: sort first and last is largest

        int largest1 = arr[0];

        for(int i =0;i<arr.length-1;i++){
            if(largest1<arr[i]){
                largest1=arr[i];
            }
        }
        System.out.println(largest1);
    }
}
