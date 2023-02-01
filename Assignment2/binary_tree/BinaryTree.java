class BinaryTree
{
  Node node;
  
  BinaryTree(int value)
  {
    node = new Node(value);
  }
  public Node insert(Node node, int value)
  {
    if(node == null)
    {
      return new Node(value);
    }
    // Move to the left if passed value is 
    // less than the current node
    if(value < node.value){
      node.left = insert(node.left, value);
    }
    // Move to the right if passed value is 
    // greater than the current node
    else if(value > node.value){
      node.right = insert(node.right, value);
    }
    return node;
  }
    
  // For traversing in ascending order
  public void inOrder(Node node)
  {
    if(node != null)
    {
      inOrder(node.left);
      System.out.print(node.value + " ");
      inOrder(node.right);
    }
  }
 
 // For traversing in descending order   
  public void inOrderDesc(Node node)
  {
    if(node != null)
    {
      inOrderDesc(node.right);
      System.out.print(node.value + " ");
      inOrderDesc(node.left);
    }
  }
}