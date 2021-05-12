import org.junit.jupiter.api.Test;

class AssociationTest {

    String llave = "llave";
    int value = 0;


    Association<String, Integer> assoc = new Association<>(llave, value);

    @Test
    void process() {
        assoc.setValue(15);
        System.out.println(assoc.toString()+",hashcode:"+assoc.hashCode());
    }
}