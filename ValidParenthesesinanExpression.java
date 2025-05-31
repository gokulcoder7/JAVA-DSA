//Valid Parentheses in an Expression

import java.util.*;




public class new2 {
    public static void main(String[] args) {


Scanner sc=new Scanner(System.in);
//
//int n=sc.nextInt();

        String str=sc.nextLine();

        Stack<Character> st=new Stack<>();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
//            System.out.println("st="+st);

            if(ch=='(' ||ch=='{' || ch=='['  ){

                st.push(ch);
            }
            else{
                if(ch==')' && st.size()!=0){
                    if(st.peek()=='('){
                        st.pop(); 
                    }
                }
                else if (ch=='}' && st.size()!=0){
                    if(st.peek()=='{'){
                        st.pop();
                    }
                }
                else if( ch==']' && st.size()!=0){
                    if(st.peek()=='['){
                        st.pop();
                    }
                }
                else{
                    if(Character.isLetter(ch)){
                        continue;

                    }
                    else {
                        System.out.println(false); //problem is for spaces , a,b,c false is printeed
                        return;
                    }
                }
            }


        }




if(st.size()==0){
    System.out.println(true);
}
else{
    System.out.println(false);
}



        }


}

