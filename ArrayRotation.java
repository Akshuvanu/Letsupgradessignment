import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotationCount = 2;
        int n = arr.length;
        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArr[(i + rotationCount) % n] = arr[i];
        }
        System.out.println(Arrays.toString(rotatedArr));
    }
}
