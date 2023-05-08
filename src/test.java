import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] test1 = {1,2,3,4,5};
        reverse(test1, 3);
        int[] test2 = {5,6,8,9};
        reverse(test2, 3);
        int[] test3 = {1,3,6,8,9,3,65,0};
        reverse(test3,4);


    }


    public static void reverse (int[] array, int k) {
        for (int i = 0; i < k/2; i++) {
            int tmp = array[i];
            array[i] = array[k-i-1];
            array[k-i-1] = tmp;
        }

        for (int i = k; i < array.length-k+(array.length-k)*0.5; i++) {
            //array.length-k+(array.length-k)/2
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] =  tmp;
            }

        System.out.println(Arrays.toString(array));
    }

    private static void reverseWholeArray(int[] arr) {

    }

    
}
