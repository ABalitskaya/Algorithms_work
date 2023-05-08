public class example {
    public static void main(String[] args) {
    example(1);
        int[] test = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
        FindIndex(test, 5);
        FindIndex(test, 7);
        FindIndex(test,0);

        String One = "Hel!lo";
        String Two = "Hello";
        FindUniqueChar(One, Two);

    }

    public static void example(int i) {
        int[] a = {0,2,3,4};
        System.out.println(test(1));
    }


    public static int test(int v) {
        int[] a = {0,2,3,4};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == v)
                return i;
        }
        return -1;

    }

    public static void FindIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == element) {
                System.out.println("Индекс искомого элемента: " + i);
                break;
            }
        }
    }

    public static void FindUniqueChar (String hasExtraChar, String b) {
        if (hasExtraChar.equals(b)) {
            System.out.println("Строки одинаковы");
        } else {
            String res = hasExtraChar + b;
            char[] array = res.toCharArray();
            }
        }


}
