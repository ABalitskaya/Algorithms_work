package Feb22;

public class Main {

    public static void main(String[] args) {
        //pushToHeadDemo();
        //pushToTailDemo();
        //removeTailDemo();
        pushByIndexDemo();

    }

    private static void pushToHeadDemo() {
        MyLinkedList list = new MyLinkedList();

        list.pushToHead(6);
        list.pushToHead(2);
        list.pushToHead(9);
        list.pushToHead(7);

        list.print();
        // expected 7 9 2 6
    }

    private static void pushToTailDemo() {
        MyLinkedList list = new MyLinkedList();

        list.pushToTail(6);
        list.pushToTail(2);
        list.pushToTail(9);
        list.pushToTail(7);

        list.print();
        // expected 6 2 9 7
    }
    private static void removeTailDemo() {
        MyLinkedList list = new MyLinkedList();

        list.pushToHead(6);
        list.pushToHead(2);
        list.pushToHead(9);
        list.pushToHead(7);
        list.removeTail();

        list.print();
        // expected 7 9 2 6
    }

    private static void pushByIndexDemo() {
        MyLinkedList list = new MyLinkedList();

        list.pushToHead(6);
        list.pushToHead(2);
        list.pushToHead(9);
        list.pushToHead(7);

        list.pushByIndex(99,0);
        list.print();
    }
}