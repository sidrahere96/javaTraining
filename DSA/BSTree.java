import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTree {
    TreeNode root;

    // Insert node using recursion
    TreeNode insert(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }

        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }

        return node;
    }

    //(Left, Root, Right)
    void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    // (Root, Left, Right)
    void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    //(Left, Right, Root)
    void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BSTree tree = new BSTree();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter no. elements to put in the tree:");
            int n = sc.nextInt();
            System.out.println("Enter the elements to put in the tree:");
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                tree.root = tree.insert(tree.root, ele);
            }

            System.out.print("In-order: ");
            tree.inOrder(tree.root);
            System.out.println();

            System.out.print("Pre-order: ");
            tree.preOrder(tree.root);
            System.out.println();

            System.out.print("Post-order: ");
            tree.postOrder(tree.root);
            System.out.println();
        }
    }
}