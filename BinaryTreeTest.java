import org.junit.jupiter.api.Test;


class BinaryTreeTest {

    BinaryTree<String> bt = new BinaryTree<String>();
    String A = "Hola";
    String a = "Adios";

    String B = "Nombre";
    String b = "Apellido";

    @Test
    void process() {
    bt.put(A,a);
    bt.put(B,b);

    System.out.println("value de Hola: "+bt.get("Hola"));
    System.out.println("value de Nombre: "+bt.get("Nombre"));

    bt.printInorder();

    }
}