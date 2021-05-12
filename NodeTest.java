import org.junit.jupiter.api.Test;

class NodeTest {

    String llave = "llave";
    int value = 0;
    Node n = new Node(llave,value);

    @Test
    void process() {

        System.out.println("value:"+n.getValue()+" trad:"+n.getTrad());

    }

}