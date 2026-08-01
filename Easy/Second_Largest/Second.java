// //better uproach
// public class Second {
//     public static void main(String args[]) {

//         int arr[] = {1, 2, 4, 7, 7, 5};

//         int largest = arr[0];
//         int Slargest = -1;

//         // Find largest
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] > largest){
//                 largest = arr[i];
//             }
//         }

//         // Find second largest
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] != largest && arr[i] > Slargest){
//                 Slargest = arr[i];
//             }
//         }

//         System.out.println(Slargest); // Output: 5 //O(2n)
//     }
// }

//optimal uproach
public class Second {
    public static void main(String args[]) {

        int arr[] = {1, 2, 4, 7, 7, 5};

        int largest = arr[0];
        int Slargest = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                Slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>Slargest && arr[i]!=largest){
                Slargest=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(Slargest);

    }
       
}
