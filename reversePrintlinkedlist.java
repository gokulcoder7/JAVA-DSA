    public static void reversePrint(SinglyLinkedListNode llist) {
      // llist is head
        if (llist ==null){

          return ;
        }
        
        reversePrint(llist.next);
        System.out.println(llist.data);
        
        
        

    }
