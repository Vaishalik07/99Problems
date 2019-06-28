//Calculates the number of elements in a tree 

public class BinaryPrintSize
{
  Node root;

  private static class Node
  {
    int data;
    Node left;
    Node right;

    Node(int value)
    {
      data = value;
      left = null;
      right = null;
    }
  }

  // public void BinaryPrintSize()
  // {
  //   root = null;
  // }

  //return size
  public int checkSize()
  {
    return size(root);
  }

  //calculate size
  public int size(Node node)
  {
    if(node == null)
    {
      return 0;
    }
    else
    {
      return (size(node.left) + 1 + size(node.right));
    }
  }

  //Creates an Empty binary tree
  public BinaryPrintSize()
  {
    root = null;
  }

  public void BinaryPrintSize(int value)
  {
    root = new Node(value);
  }

  public static void main(String[] args)
  {
      BinaryPrintSize tree = new BinaryPrintSize();
      tree.root = new Node(2);
      tree.root.left = new Node(3);
      tree.root.right = new Node(4);
      tree.root.left.left = new Node(5);
      tree.root.left.right = new Node(6);
      System.out.println("The size of the Binary Tree : " + tree.checkSize());
  }
}
