import org.junit.jupiter.api.Test;

class FactoryTest {

    Factory f = new Factory();

    @Test
    void process() {

        f.getImp("SplayTree");
        f.getImp("RedBlackTree");
        f.getImp("BinaryTree");

    }

}