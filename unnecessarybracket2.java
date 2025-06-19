

 import java.util.*;


public class anki2 {

     public static void main(String[] args) {



Scanner sc=new Scanner(System.in);


        String s=sc.nextLine();
        int p=0;


        Stack<Character> st=new Stack<>();


        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);

            if(ch==')')  {

                p=0;
     while(!st.empty() && st.peek()!='('){
        st.pop();
        p+=1;

     }


     if(p==0 &&  st.peek()=='(' ){
         System.out.println("unnecessary bracket ===true");
         return;


     }

     if( st.peek()=='('){
         st.pop();               //
     }











            }
            else {
                st.push(ch);
            }
        }




         System.out.println("necessary bracket ===false  ");


     }


}
