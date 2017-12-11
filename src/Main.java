import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 1, 3, 5, 7, 8, 6};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
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
}
