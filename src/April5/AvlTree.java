package April5;

public class AvlTree {
    private Node root;

    public Node insert(int key) {
        this.root = insertRecursion(root, key);
        return root;
    }

    private Node insertRecursion(Node node, int key) {
        if (node == null) { // если нодп пустая, то в результат записываем нашу новую ноду
            Node res = new Node();
            res.setKey(key);
            return res;
        }

        if (key < node.getKey()) { // если меньше ключа ноды, идем налево и рекурсивно вызываем метод
            node.setLeft(insertRecursion(node.getLeft(), key));
        }
        else {
            node.setRight(insertRecursion(node.getRight(), key)); // в противном случае идем налево и рекурсивно вызываем метод
        }
        // Это не так. Нужно учесть случай равенства

        return balanceTree(key, node);
    }

    private Node balanceTree(int key, Node newNode) {
        newNode.setHeight(1 + Util.max(Util.getHeightNode(newNode.getLeft()), Util.getHeightNode(newNode.getRight())));

        int balance = Util.getBalanceFactor(newNode); // узнаем фактор баланса

        if (balance > 1 && key < newNode.getLeft().getKey()) //левое дерево больше правого
            return Util.leftRotate(newNode); // RR должно быть

        if (balance < -1 && key > newNode.getRight().getKey())// правое дерево больше левого
            return Util.leftRotate(newNode);

        if (balance > 1 && key > newNode.getLeft().getKey()) {
            newNode.setLeft(Util.leftRotate(newNode.getLeft())); // setRight?
            return Util.rightRotate(newNode);
        }

        if (balance < -1 && key < newNode.getRight().getKey()) {
            newNode.setRight(Util.rightRotate(newNode.getRight())); //setLeft??
            return Util.leftRotate(newNode);
        }

        return newNode;
    }
}
