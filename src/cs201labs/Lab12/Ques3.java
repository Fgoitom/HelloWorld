package cs201labs.Lab12;

public class Ques3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print(sumOfArray(arr,0));
    }

    public static int sumOfArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        } else {
            return arr[index]+sumOfArray(arr,index+1);
        }
    }


}
