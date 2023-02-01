public class TreeSort 
{    
    public static void main(String[] args) 
    {
	    int[] arr = {50, 30, 70, 15, 7, 62, 22, 35, 87, 22, 31};	   
	    
	    BinaryTree tree = new BinaryTree(arr[0]);
	    
	    for(int num : arr)
	        tree.insert(tree.node, num);
	    
	    System.out.println("Sorted Array (Ascending order)");
	    tree.inOrder(tree.node);
	    System.out.println();
	    
	    System.out.println("\nSorted Array (Descending order )");
	    tree.inOrderDesc(tree.node);
  }
}