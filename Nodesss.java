package laby2;

import java.util.*;

public class Nodesss {

    static class Node {
        int parents;
        Node left, right;
        Node(int d) { parents = d; }
    }

   
    static class BinaryTree {
        Node root;

        void inorder(Node n, List<Integer> out) {
            if (n == null) return;
            inorder(n.left, out);
            out.add(n.parents);
            inorder(n.right, out);
        }

        void preorder(Node n, List<Integer> out) {
            if (n == null) return;
            out.add(n.parents);
            preorder(n.left, out);
            preorder(n.right, out);
        }

        void postorder(Node n, List<Integer> out) {
            if (n == null) return;
            postorder(n.left, out);
            postorder(n.right, out);
            out.add(n.parents);
        }

        List<Integer> levelOrder(Node n) {
            List<Integer> out = new ArrayList<>();
            if (n == null) return out;
            Queue<Node> q = new ArrayDeque<>();
            q.add(n);
            while (!q.isEmpty()) {
                Node cur = q.remove();
                out.add(cur.parents);
                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }
            return out;
        }
    }

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();

      
        t.root = new Node(10);
        t.root.left = new Node(5);
        t.root.right = new Node(15);
        t.root.left.left = new Node(2);
        t.root.left.right = new Node(7);
        t.root.right.left = new Node(12);

        List<Integer> in = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        t.inorder(t.root, in);
        t.preorder(t.root, pre);
        t.postorder(t.root, post);

        System.out.println("Inorder     : " + in);
        System.out.println("Preorder    : " + pre);
        System.out.println("Postorder   : " + post);
        System.out.println("Level order : " + t.levelOrder(t.root));
    }
}


