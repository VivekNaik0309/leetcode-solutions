public class arraysortedornot {
    public static void main(String args[]) {

        int arr[] = {1, 2, 4, 7, 7, 5};

        int largest = arr[0];
        int Slargest = -1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                Slargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > Slargest && arr[i] != largest) {
                Slargest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + Slargest);
    }
}