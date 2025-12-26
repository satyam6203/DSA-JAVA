public class MajorityElem {
    static int Approch1(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    static int Approch2(int arr[]) {
        int n = arr.length;
        int res = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[res]) {
                count++;
            }
        }
        if (count <= n / 2) {
            return -1;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 40, 50, 10, 10 };
        System.out.println(Approch1(arr));
    }
}
