public class Node<E>{
    E value;
    E trad;
    Node<E> left;
    Node<E> right;

    Node(E value,E trad) {
        this.value = value;
        this.trad = trad;
        right = null;
        left = null;
    }

    public E getValue(){
        return value;
    }
    public E getTrad(){return trad;}
}
