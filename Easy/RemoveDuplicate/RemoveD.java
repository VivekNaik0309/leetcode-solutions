// //Brute force uproach //nlogn
// import java.util.HashSet;
// public class RemoveD {
//     public static void main(String[] args) {

//         int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};

//         HashSet<Integer> set = new HashSet<Integer>();

//         // Add all elements to the HashSet
//         for (int i = 0; i < arr.length; i++) {
//             set.add(arr[i]);
//         }

//         // Copy unique elements back to array
//         int index = 0;
//         for (int num : set) {
//             arr[index] = num;
//             index++;
//         }

//         // Print unique elements
//         System.out.println("Unique elements:");
//         for (int i = 0; i < index; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println("\nLength after removing duplicates = " + index);
//     }
// }

public class RemoveD {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};

        // Edge case
        if (arr.length == 0) {
            System.out.println("Length after removing duplicates = 0");
            return;
        }

        int i = 0; // Points to last unique element

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // Print unique elements
        System.out.print("Array after removing duplicates: ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }

        System.out.println("\nLength after removing duplicates = " + (i + 1));
    }
}