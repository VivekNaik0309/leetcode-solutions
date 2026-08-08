
public class optimalmajority {
    public static void main(String[] args) {

        int[] v = {2, 2, 1, 1, 1, 2, 2};

        int cnt = 0;
        int el = 0;

        // Find the candidate
        for (int i = 0; i < v.length; i++) {

            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            }
            else if (v[i] == el) {
                cnt++;
            }
            else {
                cnt--;
            }
        }

        // Count how many times candidate occurs
        int cnt1 = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == el) {
                cnt1++;
            }
        }

        // Check if candidate is actually majority
        if (cnt1 > (v.length / 2)) {
            System.out.println(el);
            return;
        }

        System.out.println(-1);
    }
}