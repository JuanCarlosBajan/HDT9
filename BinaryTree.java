public class BinaryTree<E extends Comparable<E>> {

    Node<E> root;

    BinaryTree()
    {
        root = null;
    }


    private Node<E> addRecursive(Node<E> current, E value, E trad) {

        if (current == null) {
            return new Node<E>(value,trad);
        }

        if (value.compareTo(current.getValue()) < 0) {
            current.right = addRecursive(current.right, value,trad);
        } else if (value.compareTo(current.getValue()) > 0) {
            current.left = addRecursive(current.left, value,trad);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void put(E value, E trad) {
        root = addRecursive(root, value, trad);
    }

    public Node<E> locateRecursive(Node<E> root, E value)
    {
        //System.out.println(root.toString());
        E rootValue = root.getValue();
        Node<E> child;

        // found at root: done
        if (rootValue.compareTo(value) == 0) return root;
        // look left if less-than, right if greater-than
        if (value.compareTo(rootValue) < 0)
        {
            child = root.right;
        } else {
            child = root.left;
        }
        // no child there: not in tree, return this node,
        /**
         * @return this node
         */
        // else keep searching
        if (child == null) {
            return null;
        } else {
            return locateRecursive(child, value);
        }
    }

    public E get(E value) {
        //printInorder();
        //System.out.println(value + " , " + );
        if(locate(value) == null){
            return null;
        } else {
            return locate(value).getTrad();
        }
    }

    public Node<E> locate(E value){
        return locateRecursive(root, value);
    }

    private void printInorderRecursive(Node<E> node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorderRecursive(node.right);

        /* then print the data of node */
        System.out.println(node.getValue().toString() + " , " + node.getTrad());

        /* now recur on right child */
        printInorderRecursive(node.left);
    }

    public void printInorder(){
        printInorderRecursive(root);
    }

}
