package Feb8;


import Feb22.MyLinkedList;

public class Main {

        public static void main(String[] args) {
            // addToTheEndDemo();
            //addToTheStartDemo();
            //addToByIndexDemo();
            //removeWithIndexDemo();
            getDemo();

        }

        private static void addToTheEndDemo() {
            DynamicArrayNew array = new DynamicArrayNew();

            array.add(5);
            array.add(3);
            array.add(8);
            array.add(9);
            array.add(18);

            System.out.println(array);
        }

        private static void addToTheStartDemo() {
            DynamicArrayNew array = new DynamicArrayNew();

            array.addToStart(5);
            array.addToStart(3);
            array.addToStart(8);
            array.addToStart(9);
            array.addToStart(18);


            System.out.println(array);

            System.out.println("Size " + array.size());
        }

        private static void addToByIndexDemo() {
            DynamicArrayNew array = new DynamicArrayNew();

            array.addWithIndex(0, 5);
            array.addWithIndex(1, 3);
            array.addWithIndex(2, 8);
            array.addWithIndex(3, 9);
            array.addWithIndex(4, 18);

            // expected [5,18,9,8,3]
            System.out.println(array);

            System.out.println("Size " + array.size());



        }
        private static void getDemo() {
            MyLinkedList list = new MyLinkedList();

            list.pushToTail(6);
            list.pushToTail(2);
            list.pushToTail(9);
            list.pushToTail(7);
            list.print();
            System.out.println(list.get(0));
            System.out.println(list.get(2));
        }
        private static void removeWithIndexDemo() {
            DynamicArrayNew array = new DynamicArrayNew();

            //array.addWithIndex(0, 5);
            //array.addWithIndex(1, 3);
            //array.addWithIndex(2, 8);
            //array.addWithIndex(3, 9);
            //array.addWithIndex(4, 18);

            array.add(5);
            array.add(8);
            array.add(3);
            array.add(2);
            array.add(7);

            System.out.println(array);
            array.removeWithIndex(1);
            array.removeWithIndex(3);

            System.out.println("Result of operation: " + array);
            System.out.println("Size " + array.size());
        }
    }

