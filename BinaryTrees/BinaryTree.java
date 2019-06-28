//Binary Tree
public class BinaryTree
{
    //Root Node pointer
    private Node root;

    //Node
    private static class Node
    {
      Node left;
      Node right;
      int data;

      Node(int value)
      {
        left = null;
        right = null;
        data = value;
      }
    }

    //Creates an empty BinaryTree

    public void BinaryTree()
    {
      root = null;
    }

    // private boolean search(Node node, int data)
    // {
    //   if(node == null)
    //   {
    //     return false;
    //   }
    //
    //   if(data == node.data)
    //   {
    //     return true;
    //   }
    //
    //   else if(data < node.data)
    //   {
    //     search(node.left, data);
    //   }
    //
    //   else
    //   {
    //     search(node.right, data);
    //   }
    // }
    // public void printTree()
    // {
    //
    //   while(node != null)
    //   {
    //       BinaryTree printMe = new BinaryTree();
    //       System.out.println(printMe.root, printMe.root.left, printMe.root.right);
    //   }
    // }

    BinaryTree(int value)
   {
       root = new Node(value);
   }

    public static void main(String[] args)
    {
      BinaryTree createMe = new BinaryTree(); //one liner to start the computation

      createMe.root = new Node(44);
      createMe.root.left = new Node(55);
      createMe.root.right = new Node(56);
      //printTree();
    }

  }
