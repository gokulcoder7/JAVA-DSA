


 import java.util.*;

public class gokul {

    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList {

        int size;
        Node head;
        Node tail;






        public int decimaL(){  //Node head



            Node curr=head;
            int ans=0;
            while(curr!=null){
            ans=(ans*2)+curr.data;
            curr=curr.next;


            }


            return ans;
        }


        public void display() {
            // using for loop

            if (size == 0) {
                System.out.println("list is empyt");
//                return;
            } else {


                Node temp= head;
                while (temp != null) {
                    System.out.print(temp.data+" ");
                    temp = temp.next;
                }


            }


        }








        public void lastadd(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=null;

            if(size==0){

                head=tail=temp;
            }

            else{
                tail.next=temp;
                tail=temp;


            }

            size++;
        }

    }


    public static void main(String[] args) {
        LinkedList l=new LinkedList();


        l.lastadd(1);
        l.lastadd(0);
        l.lastadd(1);


//
//        l.lastadd(10);


        l.display();

        int x= l.decimaL();
        System.out.println("decimal=="+x);


        
 }


 }


