public class BetterMissing {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5};
        int n = 5;

        int hash[] = new int[n + 1];

        // Mark the numbers present
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] = 1;
        }

        // Find the missing number
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                System.out.println("Missing Number: " + i);
                return;
            }
        }
    }
}