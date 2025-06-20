import java.util.*;

public class new3 {



    // Extending Java's LinkedList to add a custom method
    public static class LinkedLis extends java.util.LinkedList<Integer> {

        // A new, custom method
        public void display() {
            System.out.print("List contents: ");
            // "this" refers to the LinkedList itself. We can iterate over it.
            for (Integer val : this) {
                System.out.print(val + " ");
            }



            System.out.println();
        }




        public void addAtStart(Integer element) {
                        // super.addFirst() is the method from the parent java.util.LinkedList class
            addFirst(element);
        }


//
//        public int fir() {
//          return this.first;
//          this.
//        }






        public int si(){

            return this.size(); // returns size of linkedlist
        }

        public void addAtMiddle(int index, int element) {
            // We can add a check to ensure the index is valid before inserting.
            // The add method allows insertion at size(), which adds to the end.
            if (index < 0 || index > this.size()) {
                System.out.println("Error: Cannot add element. Index " + index + " is out of bounds for list of size " + this.size());
                return;
            }
            // super.add(index, element) is the method from the parent class
            super.add(index, element);
        }


//
//        public void lastadd(int val){
//            new2.Node temp=new new2.Node();
//            temp.data=val;
//            temp.next=null;
//
//            if(size==0){
//
//                head=tail=temp;
//            }
//
//            else{
//                tail.next=temp;
//                tail=temp;
//
//
//            }
//
//            size++;
//        }
//
//



    } // class LinkedLis ends

    public static void main(String[] args) {
        LinkedLis list = new LinkedLis();

        // Use the methods from the parent java.util.LinkedList
        list.add(1);       // Adds to the end
        list.add(2);
        list.addLast(3);   // Another way to add to the end
        list.addFirst(0);  // Adds to the beginning

        // Call your custom display method
        list.display(); // Output: List contents: 0 1 2 3 

        // Use other inherited methods
        list.removeFirst();
        System.out.println("Contains 2? " + list.contains(2)); // Output: Contains 2? true
        System.out.println("Element at index 1: " + list.get(1)); // Output: Element at index 1: 2

        list.display(); // Output: List contents: 1 2 3



        list.addAtStart(77);

        System.out.println(list);


        list.addAtMiddle(3,88);
        System.out.println(list);


System.out.println("prints size=="+list.si());
    }
}
