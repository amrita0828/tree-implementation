import java.util.*; 
class file1 
{  
static class Node {  
    int key;  
     Node left, right;  
};  
    
static Node newNode(int data)  
{  
    Node temp = new Node();  
    
    temp.key = data;  
    
    temp.left = null;  
    temp.right = null;  
    
    return temp;  
}  
 
static Node insert(Node root, int key)  
{   
    Node newnode = newNode(key);   
    Node x = root;   
    Node y = null;  
    
    while (x != null) {  
        y = x;  
        if (key < x.key)  
            x = x.left;  
        else
            x = x.right;  
    }   
    if (y == null)  
        y = newnode;  
    else if (key < y.key)  
        y.left = newnode;   
    else
        y.right = newnode;  
    
    
    return y;  
}  
static void Inorder(Node root)  
{  
    if(root==null)
    return;
 else
  {
   Inorder(root.left);
System.out.println(root.key+" ");
 Inorder(root.right);
  
   
   }

}
    
 

static void Postorder(Node root)
{
 if(root==null)
    return;
 else
  {
   Postorder(root.left);

 Postorder(root.right);
  System.out.println(root.key+" ");
   
   }

}

static void Preorder(Node root)
{
if(root==null)
    return;
 else
  {
System.out.println(root.key+" ");
   Preorder(root.left);

 Preorder(root.right);
  
   
   }
}
    
  
public static void main(String args[])  
{
    
    Node root = null;  
    root = insert(root, 50);  
    insert(root, 30);  
    insert(root, 20);  
    insert(root, 40);  
    insert(root, 70);  
    insert(root, 60);  
    insert(root, 80);  
    
  Inorder(root);
Postorder(root);
    Preorder(root);
}  
} 


