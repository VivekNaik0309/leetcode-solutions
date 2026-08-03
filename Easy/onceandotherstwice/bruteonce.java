 public class bruteonce {
    public static void main(String[] args) {

        int arr[] = {1,1,2,3,3,4,4,5,5};
        int num=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            num=arr[i];
            count=0;
            for(int j=0;j<arr.length;j++){
                if(num==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(num);
            }
        }
    }
}