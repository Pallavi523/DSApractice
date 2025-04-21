public class SearchInBitonicArray {
    public static int search(int[] arr, int target) {
        int peak = findPeak(arr);
        int leftSearch = ascbinarySearch(arr, 0, peak, target);
        if (leftSearch != -1) {
            return leftSearch;
        }
        return descbinarySearch(arr, peak + 1, arr.length - 1, target);
    }

    private static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static int ascbinarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static int descbinarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        int target = 4;
        int result = search(arr, target);
        System.out.println(result); // Output: 4
    }
}
