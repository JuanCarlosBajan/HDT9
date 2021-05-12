import org.junit.jupiter.api.Test;


class SplayTreeTest {

    SplayTree st = new SplayTree();

    String A = "Hola";
    String a = "Adios";

    String B = "Nombre";
    String b = "Apellido";

    @Test
    void process() {
        st.put(A,a);
        st.put(B,b);

        System.out.println("value de Hola: "+st.get("Hola"));
        System.out.println("value de Nombre: "+st.get("Nombre"));

        System.out.println(st.contains("Hola"));
        System.out.println(st.contains("ejemplo"));

    }

}