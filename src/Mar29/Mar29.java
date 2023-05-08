package Mar29;

/*
* Метод Add (int value)
* 1.1 if root = null - дерево пустое
* 1.2   if root != null - дерево не пустое
* 2. if 1.1 = true - root = value
* 3. if 1.2 = true ->
* 4.1 if value < root.value{root = leftNode}
*   go to 1.1
* 4.2 if value > root.value{root = rightNode}
* go to 1.1
* 4.3 else close
*
*
*Метод Find (int value)
* 1.1 if root = null - такого элемента нет
 * 1.2   if root != null - дерево не пустое
 * 2. if 1.2 = true ->
 * 4.1 if value < root.value{root = leftNode}
 *   go to 1.1
 * 4.2 if value > root.value{root = rightNode}
 * go to 1.1
 * 4.3 else - return root
 *
 * Метод print Метод compare
 * 1.1 if root = null - ничего не делаем
 * 1.2 if root != null - получаем значение левого нода
 * 2.1 root = leftNode. Go to 1.1
 * 3.1 print root, return
 * 3.2 root = rightNode, go to 1.1
 *
*
*
*
*
*
* */