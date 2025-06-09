import java.util.*;


// 7
// 100 80 60 70 60 75 85

public class new2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int [] ar=new int[n];
        for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();

        }


        int [] res=new int[n];
        Stack<Integer> st=new Stack<>();

        res[0]=1;

        st.push(0);

        for(int i=1;i<n;i++){
            System.out.println("i= "+i);
            int x=ar[i];
            int p=0;
//            int in=-1;
            int ans=1;
            int siz=st.size();
            while(  !st.empty()  &&  ar[st.peek()]<x){  // i+in=5-1=4  in--  so its=  5-2=3    5-3=2


                st.pop();
                p+=1; // pop count
//                in--;


                System.out.println(Arrays.toString(res));
                System.out.println("p== "+p+"\n    siz=="+siz);



                if(p==siz){
                    // popped all elements of stack so its index+1
                    ans=i+1;
                    System.out.println("break occured p==siz");
                    break;
                }

                System.out.println("stack=  "+st+"top="+st.peek());
                ans=i-st.peek();




                if(st.empty()){
                    ans=i+1;
                    break;
                }


                System.out.println("ans= (at while end)"+ans);

            }








            if(p==0){
                ans=1;
            }
            res[i]=ans;

            st.push(i);




            System.out.println(" (at end of for loop) res== "+Arrays.toString(res));
            System.out.println("stack= (at end of for loop) "+st+"top="+st.peek());

        }





        System.out.println("\n\n final res== "+Arrays.toString(res));



        }
}


