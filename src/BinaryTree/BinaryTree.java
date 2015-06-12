package BinaryTree;

/**
 * @author Hilary Brobbey
 */
public class BinaryTree {

    Node root = null;

    public BinaryTree(Comparable rootData) {
        root = new Node(rootData);
    }

    public BinaryTree() {
    }

    public void Insert(Comparable x) {
        root = Insert(x, root);
    }

    public boolean Lookup(Comparable x) {
        return Lookup(x, root);
    }

    public int size() {
        return size(root);
    }

    public int maxDepth() {
        return maxDepth(root);
    }

    public Comparable DeepestNode() {
        return DeepestNode(root);
    }

    public Comparable minValue() {
        return minValue(root);
    }

    public void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(Node r) {
        if (r != null) {
            printInOrder(r.left);
            System.out.print(r.data + " ");
            printInOrder(r.right);
        }
    }

    private Comparable minValue(Node r) {
        if (r == null) {
            return null;
        } else if (r.left == null) {
            return r.data;
        } else {
            return minValue(r.left);
        }
    }

    private Comparable DeepestNode(Node r) {
        if (r == null) {
            return null;
        } else if (r.left == null && r.right == null) {
            return r.data;
        } else if (maxDepth(r.left) > maxDepth(r.right)) {
            return DeepestNode(r.left);
        } else {
            return DeepestNode(r.right);
        }

    }

    private int maxDepth(Node r) {
        if (r == null) {
            return 0;
        }
        return Math.max(maxDepth(r.left), maxDepth(r.right)) + 1;
    }

    private int size(Node r) {
        if (r == null) {
            return 0;
        }
        return size(r.left) + size(r.right) + 1;
    }

    private Node Insert(Comparable x, Node r) {
        if (r == null) {
            r = new Node(x);
        } else if (x.compareTo(r.data) <= 0) {
            r.left = Insert(x, r.left);
        } else {
            r.right = Insert(x, r.right);
        }
        return r;
    }

    private boolean Lookup(Comparable x, Node r) {
        if (r == null) {
            return false;
        } else if (x.compareTo(r.data) == 0) {
            return true;
        } else if (x.compareTo(r.data) < 0) {
            return Lookup(x, r.left);
        } else {
            return Lookup(x, r.right);
        }
    }

    class Node {

        Comparable data;
        Node left;
        Node right;

        Node(Comparable d, Node l, Node r) {
            data = d;
            left = l;
            right = r;
        }

        Node(Comparable d) {
            this(d, null, null);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(50);
        tree.Insert(100);
        tree.Insert(25);
        tree.Insert(20);
        tree.Insert(10);
        tree.Insert(30);
        tree.Insert(75);
        tree.Insert(150);
        tree.Insert(28);
        tree.Insert(200);
        System.out.println(tree.Lookup(100));
        System.out.println(tree.size());
        System.out.println(tree.maxDepth());
        System.out.println(tree.DeepestNode());
        System.out.println(tree.minValue());
        tree.printInOrder();
    }
}
