public class Dima {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = 11;
        int d = 14;

        //a = a+c;
        //c = a-c;
        //a = a-c;
         a = a + c - (c = a);
         b = b + a - (a = b);
        System.out.println(a + " " + b + " " +c);




    }
}
