package BinaryTree;
public class binarytree {
     treenode root;
    public boolean isEmpty(){
        return (root==null);
    }
    
    public void insert(treenode input){
        if (isEmpty()){
            root = input;
        }else{
            treenode current = root;
            treenode parent = null;
            boolean diKiri = true;
            while (current != null){
                parent = current;
                if (current.data < input.data){
                    current = current.right;
                    diKiri = false;
                }else if (current.data > input.data){
                    current = current.left;
                    diKiri = true;
                }else{
                    System.out.println("data"+input.data+"is exist");
                    break;
                }
            }
            if (diKiri){
                parent.left = input;
            }else{
                parent.right = input;
            }
        }
    }
    
    public void preOrder(){
        preOrdered(root);
    }
    
    public void inOrder(){
        inOrdered(root);
    }
    
    public void postOrder(){
        postOrdered(root);
    }
    
    public void preOrdered(treenode root){
        if (root != null){
            System.out.print(root.data+" ");
            preOrdered(root.left);
            preOrdered(root.right);
        }
    }
    
    public void inOrdered(treenode root){
        if (root != null){
            inOrdered(root.left);
            System.out.print(root.data+" ");
            inOrdered(root.right);
        }
    }
    
    public void postOrdered(treenode root){
        if (root != null){
            postOrdered(root.left);
            postOrdered(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    public treenode search (int key){
        treenode node = null;
        treenode current = root;
        while (current != null){
            if (current.data == key){
                return node;
            }else{
                if (current.data < key){
                    current = current.right;
                }else{
                    current = current.left;
                }
            }
        }
        return node;
    }
}
