/**
 * Marco Ramirez
 * Jose Ramos
 * 
 */
import java.util.PriorityQueue;

class Factory {
	/**
	 * 
	 */
    public Factory(){}
    Object tree;
    /**
     * 
     * @param imp
     * @return
     */
    public Object getImp(String imp) {
    // Implementaciones
        if(imp.equals("SplayTree"))
        {   
            tree = new SplayTree<>();
        }else if (imp.equals("RedBlackTree")){
            tree = new RedBlackBST<>();
        } else {
            tree = new BinaryTree<String>();
        }
        return tree;
   }

}
