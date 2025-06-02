// Next Greater Element on the Right




import java.util.*;
public class ank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        Stack<Integer> anss=new Stack<>();
        st.push(ar[n-1]);
        System.out.print(-1+" ");
        int [] l=new int[n];
        l[n-1]=-1;

//        anss.push(-1);
        for(int i=n-2;i>=0;i--){

//            System.out.print(st+" \n");


            int x=ar[i];
            int ans;
            while(st.peek()<x){
                st.pop();

                if(st.empty()){
                    break;
                }
            }
            if(st.empty()){
                    ans=-1;
            }
            else{

                ans=st.peek();
            }

            System.out.print(ans+" ");
            l[i]=ans;
//            anss.push(ans);
//            System.out.println("stack ="+anss);


        st.push(x);




        }
System.out.println("l="+Arrays.toString(l));

        for(int i=0;i<n;i++){
           anss.push(l[i]);
        }

        System.out.println("\n final answer:  ");
System.out.println(anss);

    }
}



