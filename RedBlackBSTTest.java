import org.junit.jupiter.api.Test;

class RedBlackBSTTest {

    RedBlackBST rb = new RedBlackBST();

    String A = "Hola";
    String a = "Adios";

    String B = "Nombre";
    String b = "Apellido";

    @Test
    void process() {
        rb.put(A,a);
        rb.put(B,b);

        System.out.println("value de Hola: "+rb.get("Hola"));
        System.out.println("value de Nombre: "+rb.get("Nombre"));

        System.out.println(rb.contains("Hola"));
        System.out.println(rb.contains("ejemplo"));

    }
}