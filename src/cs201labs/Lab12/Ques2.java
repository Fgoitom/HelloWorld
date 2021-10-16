package cs201labs.Lab12;

public class Ques2 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 8, 2, 0, -1};
        System.out.print(minRecursion(arr, 0, 0));
    }

    public static int minRecursion(int arr[], int index, int min) {
        if (index == arr.length) {
            return min;
        }
        else if (arr[index] < min) {
            min = arr[index];
            return min;
        } else {
            return minRecursion(arr, index + 1, min);

        }
    }
}
