import java.util.*;




//
//
//
//
//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//



public class ank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] a1=new int[n1];
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }


        int n2=sc.nextInt();
        int[] a2=new int[n2];
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }
//
        //sum of 2 arrays

//

        int ma=(n1>n2)?n1:n2;
        int[] sum=new int[(n1>n2)?n1:n2];

        int i= a1.length-1;

        int j= a2.length-1;
        int k= sum.length-1;

int c=0;
while (k>=0){
    int d=c;
if(i>=0){
    d+=a1[i];
}

if(j>=0){

    d+=a2[j];
}



    d=d%10;
    c=d/10;

    sum[k]=d;

    i--;
    j--;
    k--;


}


        for(i=0;i<ma;i++){
           System.out.print(sum[i]+" ");
        }






    }
}



