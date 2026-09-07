//this is a brute approach using extra space with T.C=O(n) and S.C=O(n)
public class modifyarray {
    public void modifyArray(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[arr[i]] = i;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }
}

//this is an optimal solution with O(1) extra space
public void rearrange(int[] arr) {

        int n = arr.length;

        
        for (int i = 0; i < n; i++) {
            int oldValue = arr[i] % n;
            int newValue = arr[oldValue] % n;

            arr[i] = oldValue + newValue * n;
        }

        
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
    }
