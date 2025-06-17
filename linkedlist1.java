import java.util.*;




public class new2 {


    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{

        int size;
        Node head;
        Node tail;


//Add at Index in Linked List

      void addAt(int val,int idx){

          Node temp=new Node();
          temp.data=val;
          temp.next=null;















      }


        void lastadd(int val){
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





        public void display(){
            Node temp=head;

            while(temp!=null){

                System.out.print(temp.data+" " );
                temp=temp.next;

            }

            System.out.println();
        }











        public void removefirst(){

            if(size==0){
                System.out.println("list is empty");
            }

            else if(size==1){
                head=tail=null;
                size=0;
            }

            else{
                head=head.next;

                size--;
            }
        }






        public int get(int idx){

            if(size==0){

                System.out.println("list is empty");
                return -1;
            }



            else if(idx<0 || idx>=size){
                System.out.println("invalid args");
                return -1;
            }


            else{

                Node temp=head;

                for(int i=0;i<idx;i++){
                    temp=temp.next;

                }

                return temp.data;


            }


        }

    } // class LinkedList ends




        public static void main(String[] args) {


            LinkedList list = new LinkedList();

          list.lastadd(1);
            list.lastadd(2);

            list.lastadd(3);

            list.lastadd(4555); // because it returns void

            list.display();
         list.removefirst();
            list.display();


            int x=list.get(1);
            System.out.println(x+"==x");

    }
}





