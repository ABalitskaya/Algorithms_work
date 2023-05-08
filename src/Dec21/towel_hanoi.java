package Dec21;

public class towel_hanoi {
    public static void main(String[] args) {
        /* First level: Задача заключается в следующем. Имеется три стержня — левый, средний и правый. На левом стержне находятся n дисков, диаметры которых различны. Диски упорядочены по размеру диаметра, сверху лежит наименьший, снизу — наибольший. Требуется перенести диски с левого стержня на правый, используя средний стержень как вспомогательный.
Головоломка имеет следующие два правила:
      1. Вы не можете поместить больший диск на меньший диск.
      2. За один раз можно перемещать только один диск.


Задача  - придумать и описать алгоритм. Можно текстом, можно псевдокодом.*/

        // каждый стержень - стэк
        //firstPol = [4,3,2,1], second =[], third = [].


        int[] test = {1, 50, 547, 200, 0, 84};
        findMaxIterative(test);
    }

    static int findMaxIterative(int[] arr) { // найти максимум циклом
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println("Maximum number is " + max);
            }
        }
        return max;
    }

    static int findMaxDivideAndConquer(int[] arr, int index) { // найти максимум рекурсией
        int max;
        int length = arr.length;

        if (length > index) {
            max = findMaxDivideAndConquer(arr, index + 1);
            if (arr[index] > max) {
                return arr[index];
            }
            else {
                return max;
            }
        }
        else {
            return arr[length -1 ];
        }
    }

    /// s1, s2
    // maximum length of common prefix = minimal from lengths of s1 and s2
    /*public static String findTheLongestCommonPrefix(String s1, String s2) {
        int countOfCommonChar = 0;

        if (s1.equals(s2) || (s1.equals(null) || s2.equals(null))) {
            System.out.println("No common prefix :( ");
        } else for (int i = 0; i < ; i++) {
            
        }

    }*/

    // for number of characters in shorter string (either s1, s2)
    // count while characters by same index are same
    // .charAt(idx)
    // .substring(startIdx, endIdx)
    // return substring of length of count




}
