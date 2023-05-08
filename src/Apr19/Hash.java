package Apr19;

public class Hash {
    public static void main(String[] args) {
        int[] array = {1,7,};
        int k = 2;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                    if(count == k) {
                        System.out.println("Первое число, встречающееся 2 раза, - это " + array[i]);
                    }
                }
            }
        }
    }
}
