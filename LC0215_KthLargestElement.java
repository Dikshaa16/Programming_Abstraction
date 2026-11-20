public class LC0215_KthLargestElement {
    // Using Selection Sort to find kth smallest
    public static int findKthSmallest(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("Kth smallest element: " + findKthSmallest(arr, k));
    }
}
