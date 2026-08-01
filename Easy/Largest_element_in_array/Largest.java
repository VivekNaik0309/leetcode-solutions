public class Largest {
    public static void main(String args[]){
        int arr[] = {3,2,1,5,2};
        
        //Using Brute force=>Time Complexity:n log n , Space complexity: sort first and last is largest

//         public class MergeSort {

//     // Merge Sort Function
//     public static void mergeSort(int arr[], int left, int right) {
//         if (left >= right) {
//             return; // Base case
//         }

//         int mid = (left + right) / 2;

//         mergeSort(arr, left, mid);      // Left half
//         mergeSort(arr, mid + 1, right); // Right half

//         merge(arr, left, mid, right);   // Merge both halves
//     }

//     // Merge Function
//     public static void merge(int arr[], int left, int mid, int right) {

//         int temp[] = new int[right - left + 1];

//         int i = left;
//         int j = mid + 1;
//         int k = 0;

//         while (i <= mid && j <= right) {
//             if (arr[i] < arr[j]) {
//                 temp[k++] = arr[i++];
//             } else {
//                 temp[k++] = arr[j++];
//             }
//         }

//         while (i <= mid) {
//             temp[k++] = arr[i++];
//         }

//         while (j <= right) {
//             temp[k++] = arr[j++];
//         }

//         for (i = left, k = 0; i <= right; i++, k++) {
//             arr[i] = temp[k];
//         }
//     }

//     public static void main(String[] args) {

//         int arr[] = {6, 3, 9, 5, 2, 8};

//         mergeSort(arr, 0, arr.length - 1);

//         System.out.println("Sorted Array:");

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }


        int largest1 = arr[0];

        for(int i =0;i<arr.length-1;i++){
            if(largest1<arr[i]){
                largest1=arr[i];
            }
        }
        System.out.println(largest1);
    }
}
