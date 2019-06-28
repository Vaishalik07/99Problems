//Returns root to leaf depth of a tree

class BinaryMaxDepth
{
  Node root;

  private static class Node
  {
    int data;
    Node left;
    Node right;
    //Constructor
    Node(int value)
    {
      data = value;
      left = null;
      right = null;
    }
  }


  //Create an empty Binary Tree
  public BinaryMaxDepth()
  {
    root = null;
  }

  public void BinaryMaxDepth(int val)
  {
    root = new Node(val);
  }

  //Returns the Depth
  public int maxDepth()
  {
    return maxDepp(root);
  }

  //Depth calculator
 public int maxDepp(Node node)
 {
    if(node == null)
    {
      return 0;
    }
    else
    {
      int leftDepp = maxDepp(node.left);
      int rightDepp = maxDepp(node.right);

      int treeDepth = Math.max(leftDepp, rightDepp);
      return treeDepth + 1;
    }
 }

//Main Method
  public static void main(String[] args)
  {
    BinaryMaxDepth depp = new BinaryMaxDepth();
    depp.root = new Node(44);
    depp.root.left = new Node(66);
    depp.root.right = new Node(10);
    depp.root.left.left = new Node(20);
    depp.root.left.right = new Node(30);
    System.out.println("The maximum depth of the tree is:" + depp.maxDepth());
  }
}

//Output : 3
