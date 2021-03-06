import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 1, 3, 5, 7, 8, 6};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {2, 4, 9, 1, 3, 5, 7, 8, 6};
        shakerSorting(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(search(arr3, 12));
    }

    //сортировка пузырьком
    public static int[] bubbleSorting(int[] arr) {
        int count = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    count++;
                }
            }
        }
        System.out.println(count);
        return arr;
    }

    //шейкерная сортировка
    public static int[] shakerSorting(int[] arr) {
        int buff;
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        do {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    buff = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buff;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    buff = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = buff;
                }
            }
            left++;
            count++;
        } while (left < right);
        System.out.println(count);
        return arr;
    }

    //бинарный поиск
    public static int search(int[] arr, int element) {
        int middle, low = 0, count = 0;
        int high = arr.length - 1;
        while (low <= high) {
            middle = (low + high) / 2;
            if (element < arr[middle]) high = middle - 1;
            else if (element > arr[middle]) low = middle + 1;
            else return middle;
        }
        return -1;
    }
}
