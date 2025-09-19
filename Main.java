package laby2;

public class Main {
    public static void main(String[] args) {
        BST t = new BST();
        int[] vals = {50, 30, 20, 40, 70, 60, 80};

        for (int v : vals) {
            t.insert(v);
        }
         System.out.print("Inorder after insertion: " ); 
 t.inorderPrint();
        


        if (t.search(t.root, 40))
            System.out.println("Search 40: Found ");
        else
            System.out.println("Search 40: Not Found ");

        if (t.search(t.root, 100))
            System.out.println("Search 100: Found");
        else
            System.out.println("Search 100: Not Found");

        
        t.deleteKey(20);
        System.out.println("After deleting 20: ");
        t.inorderPrint();

        t.deleteKey(30);
        System.out.println("After deleting 30: ");
        t.inorderPrint();

        t.deleteKey(50);
        System.out.println("After deleting 50: ");
        t.inorderPrint();

    }
}
