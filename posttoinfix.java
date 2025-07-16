
import java.util.*;
public class anki {

    public static void main(String[] args) {



        Stack<String> st=new Stack<>();

        //String s="ABC*+";  //[C*B+A]
        String s="ab*c+";
        
int n=s.length();
        for(int i=0;i<n;i++){

            char c=s.charAt(i);


            if(Character.isLetter(c)){ //isalnum()
                st.push(c+ "");

            }
            else{
                // operators

                String a=st.pop();

                String b=st.pop();

                String exp=a+String.valueOf(c)+b;
                st.push(exp);




            }

        }
        System.out.println(st);


    }
}
