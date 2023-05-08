package Feb15;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueuesDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>(); //нефиксированная длина


        queue.add("AAA");
        queue.offer("BBB"); // для LinkedList то же, что и add

        queue.remove(); //удаляет. вернет ошибку, если очередь пустая
        queue.poll(); // тоже удаляет, но возвращает falls, если очередь пустая

        queue.element(); // смотриит первый элемент
        queue.peek(); // смотрит первый элемент и возвращает null, если очередь пустая
    }

    public static Queue<Integer> generateTasks() {
        // returns Queue of size 10
        return null;
    }

    public static  void divideByHalf(Queue<Integer> queue) {
        //5, 6, 8, 3
        //2, 1, 1, 1, 1, 1, 2
        List<Integer> res = new LinkedList<>();

        while (!queue.isEmpty()) {
            Integer temp = queue.remove();

            if (temp / 2 > 2 ) {
                queue.add(temp/2);
            } else {
                res.add(temp/2);
                if(temp % 2 == 1) {
                    res.add(1);
                }
            }
        }
        System.out.println("Res" + res);


    }
}
