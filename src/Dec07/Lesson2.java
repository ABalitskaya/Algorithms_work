package Dec07;

public class Lesson2 {
    public static void main(String[] args) {




    }
    // Константные О(1) - потому что нам нужна только одна операция, чтоб получить result
    public static int getSize(int[] arr) {
        return arr.length;
    }
    // O(1) одна операция,не зависимо от  того, насколько большие числа
    //* O(n) - n - length of number
    public static int sumNums(int a, int b) {
        return a + b;
    }

    //O(n) n - length of array
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { //O(n)
            sum +=arr[i]; //O(1) Последовательно сложить значения всех элементов массива
        }
        return sum; //O(1)
    }
    // O(1) + O(n)*O(1) + 0(1) = в итоге O(n)


    //перевернуть массив
    //time complexity O(n)
    // space complexity 0(1)
    public static int[] reversArr(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n]; //O(n) space complexity
        for (int i = 0; i < n; i++) { //O(n) - time
            reversed[n - 1 - i] = arr[i];
            // i = 0, reversed[n-1] = arr[0];
            // i = 1, reversed[n-2] = arr[1];
        }
        return reversed;
    }

    //time complexity O(n/2) = O(n)
    //spece complexity 0(1)
    public static int[] reverseArrBetterVersion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length / 2; i++) { //O(n/2)
            int tmp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = tmp;
        }
        return arr;
    }

    // time complexity O(n^2)
    // space complexity O(1)
    public static void printMultiples(int[] arr) {
        int n = arr.length;
        for (int i = 0; i< n; i++) { //O(n)
            int elem = arr[i];
            for (int j = 0; j < arr.length; j++) { //O(n)
                int otherElem = arr[j];
                int result = elem * otherElem;
                System.out.println("i * j " + result);
            }
        }
    }
    // n - array of length
    // i = 0, j = 0 1 2 ... n - 1  - n operations
    // i = 1, j = 0 1 2 ... n - 1 - n operations
    // ...
    // i = n - 1, j = 0 1 2 ... n - 1 - n operations

    // n + n + .. + n = n * n = n ^ 2

    // for each i from 0 to n-1 we do n-1 operations


    //Логарифм - это количество умножений числа на самого себя, чтоб получить результат.
    //  Результат - это то, что в скобках
    //O(log n)
    // 2^3 = 8 = log_2(8) = 3
    // log_2(64) = 6
    //log_2(1024) = 10

    // n-> n/2 -> n/4 -> n/8 -> ... ->1
    //lon(n) steps from n to 1 Это (log_2(n))

    // n -> n/5 -> n/25 -> ... -> 1
    // log(n) steps from n to 1 Это (log_5(n))

    // Найти в отсортированном массиве искомый ключ и вернуть его индекс
    //[5, 8, 13, 17, 19, 24, 29]
    //Бинарный поиск!!
    /*public static int binarySearch (int[] arr, int key) {
        int n = arr.length;
        int midIdx = n / 2;
        int middleElem = arr[midIdx];

        if (middleElem == key) {
            return midIdx;
        }
        else if (key < middleElem) {
            //убрать левую часть рассматривать только правую часть
            // return
        }
        else {
            //рассматривать только левую часть
            //return
        }
    }*/


    // time complexity O(m*n)
    public static void printStars(int[] stars, int[] numbers) {
        for (int i = 0; i < stars.length; i++) { //n
            for (int j = 0; j < numbers.length; j++) {
                System.out.println("*");

            }
            System.out.println();

        }
    }

    // time complexity O(n^2) - Потому что нам не важны константы, все делители и множители убрали
    public static void bubleFor(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 4; i++) { //0(n/4) = O(n)
            for (int j = 0; j < n * 2; j += 5) { //O(n*2/5) = O(n)
                System.out.print("bubble");
            }

        }
    }


    // best case O(1) when n<=0
    // worst case O(n) when n > 0
    // average case O(n)
    public static void printNumbers(int n) {
        if (n<0) {
            return;
        }
        else {
            for (int i = 0; i < n; i++) { //Перебираем числа от 0 до n, чтоб их все вывести на экран
                System.out.println(i);

            }
        }
    }

    // time complexity
    // best case (array already sorted) O(n)
    // worst case O(n^2)
    public static int findMaxSum(int[] arr) {
        int n = arr.length;
        // check if array is sorted
        boolean isSorted = true;
        for (int i = 0; i < n - 1; i += 2) { // O(n)
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
            }
        }
        // if array is sorted then maximum sum is sum of two latest elements
        if (isSorted) {
            return arr[n - 1] + arr[n - 2]; // O(1)
        }
        int max = 0;
        // calculate sums of pairs and return the maximum
        for (int i = 0; i < n; i++) { // O(n)
            for (int j = 0; j < n; j++) { // O(n)
                int sum = arr[i] + arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;

    }



}
