package home_work_2.utils;

public class SortsUtils {
    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = arr.length - 1; j > i; j--) {
                if(arr[j-1] > arr[j]) {
                    int a = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = a;
                }
            }
        }
    }

    public static void shake(int[] arr) {
        int left = 0, right = arr.length - 1;
        boolean isMoved = true;

        while(isMoved && left < right) {
            isMoved = false;
            for(int i = left; i < right; i++) {
                if(arr[i] > arr[i+1]) {
                    int a = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = a;
                    isMoved = true;
                }
            }
            right--;

            for(int i = right; i > left; i--) {
                if(arr[i] < arr[i-1]) {
                    int a = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = a;
                    isMoved = true;
                }
            }
            left++;
        }
    }
}
