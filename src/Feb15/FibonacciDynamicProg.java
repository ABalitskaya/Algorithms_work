package Feb15;

import java.util.Arrays;

public class FibonacciDynamicProg {
    public static void main(String[] args) {
        //Integer[] dynamicResults = new Integer[11];
        //fibonacciMemorization(10, new Integer[11]);
        //System.out.println("Array " + Arrays.toString(dynamicResults));

        //int fibonacci10 = fibonacciTabulation(10);
        //System.out.println("Fibonacci " + fibonacci10);

        int fibonacci10 = fibonacciTabulationOptimized(10);
        System.out.println("Fibonacci " + fibonacci10);
    }

    public int fibonacci(int n) {
        if (n<2) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int fibonacciMemorization(int n, Integer[] arr) {
        if (n<2) return 1;

        if (arr[n] != null) {
            System.out.println("Reused calculation of fib("+ n +")");
            return arr[n];
        }

        arr[n] = fibonacciMemorization(n-1, arr) + fibonacciMemorization(n-2, arr);
        return arr[n];
    }

    public static int fibonacciTabulation (int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        int res = 0;
        for (int i = 2; i <= n ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("Array tabulation" + Arrays.toString(arr));
        return arr[n];
    }

    public static int fibonacciTabulationOptimized (int n) {
        int beforeLastFib = 1;
        int lastFib = 1;
        int currentFib = 0;
        for (int i = 2; i <=n ; i++) {
            currentFib = lastFib + beforeLastFib;
            beforeLastFib = lastFib;
            lastFib = currentFib;
        } return currentFib;

        }

    }


