package April5;

public class Algorithm {
    public static void main(String[] args) {

    }
    /*
    * Node(key, value, leftNode, rightNode, height)
    * binaryTree (rootNode)
    *
    * Insert (key, value)
    *
    * Insert (node, key, value)
    *
    * getBalanceFactor (node)
    *
    * balance (node)
    *
    *
    *
    *
    * getBalanceFactor (node)
    *
    * diff = (node.leftNode.height - node.rightNode.height).
    * return diff
    *
    *
    *
    * Insert (key, value)
    * Вызов insert (root, key, value)
    *
    *
    *
    *Insert (node, key, value)
    * Проверка node == null
    * if node == null >> return node = new node(key value)
    * if key == node.key >> return node
    * if key < node.key >> node.leftNode = insert(node.leftNode, key, value)
    * else  node.rightNode = insert(node.rightNode, key, value)
    *
    * node.height = max(node.leftNode.height, node.rightNode.height) + 1
    * return balance(node)
    *
    *
    *
    *
    * balance (node)
    * if node == null >> return null
    * balanceFactor = getBalanceFactor(node)
    *
    * if balanceFactor > 1 ( работаем с левым поддеревом )>>
    *   1) RR
    *   2) LRR
    * if balanceFactor < -1 (работаем с правым поддеревом) >>
        1) LR
        2) RLR
    * return node
    *
    * */
}
