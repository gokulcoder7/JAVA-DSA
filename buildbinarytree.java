

 import java.util.*;



public class anki2 {


    public static class Node{
        int data;

        Node left;
        Node right;



        Node(int data){
            this.data=data;
            this.left=null;

            this.right=null;


        }

    }
    public static class btree{

        static int idx=-1;


        public static Node buildtree(int[] nodes){
               idx++;


               if(nodes[idx]==-1){

                   return null;
               }


          Node newnode=new Node(nodes[idx]);

            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);

            return newnode;
        }
    }







     public static void main(String[] args) {




       int nodes[] = { 22, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
         btree bt=new btree();

         Node root=bt.buildtree(nodes);

         System.out.println(root.data);


         System.out.println(root.left.data);









     }


}
