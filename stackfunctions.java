import java.util.*;
public class ank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Stack<Integer> st=new Stack<>();



        int[] ar=new int[10];

        st.push(7);



        st.push(8);





















        st.push(9);

        Collection<String> c = new ArrayList<String>();
        c.add("A");
        c.add("Computer");
        c.add("Portal");


        System.out.println("  c===  \n"+c);






        System.out.println(st  +"  search of 8==  \n"+st.search(8));

        System.out.println(st  +"  search of 7==  \n"+st.search(7));
        System.out.println(st  +"  search of 88==  \n"+st.search(88));


        st.push(55);
        st.insertElementAt(89,4);

        System.out.println(st);





//
//        st.copyInto(ar);

        Object[] a=st.toArray();

        System.out.println(a);

        for(Object v:a){
            System.out.println(v);

        }

















    }
}



