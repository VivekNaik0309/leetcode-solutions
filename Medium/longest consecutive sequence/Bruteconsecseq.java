public class Bruteconsecseq {
    static boolean ls(int arr[], int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] = {102, 4, 100, 101, 3, 2, 1, 1};
        int n = arr.length;

        int longest = 1;

        for (int i = 0; i < n; i++) {

            int x = arr[i];
            int cnt = 1;

            while (ls(arr, x + 1)) {
                x = x + 1;
                cnt = cnt + 1;
            }

            longest = Math.max(longest, cnt);
        }

        System.out.println(longest);
    }
}
