package Dec14;

public class Lesson3 {
    public static void main(String[] args) {

    }

    static int sumOfValuesUntil(int n) {

        if (n == 1) return 1; //Базовый случай (где рукурсия останавливается)
        else
            System.out.println("Calling" + n + "sumOfValuesUntil(" + (n - 1) + ")");
        return n + sumOfValuesUntil(n-1); // Вызов рекурсии
    }


    // Рекурсивно найти, есть ли гласные в строке
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'o' || ch == 'u' || ch == 'e' || ch == 'i';
    }


    static boolean hasVowels(String s) {
        if (s.length() == 0) {
    return false;

        }
        char ch = s.charAt(0);

        return isVowel(ch) || hasVowels(s.substring(1));

    }



}
