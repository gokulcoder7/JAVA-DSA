*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	

import java.util.*;
public class gokul{


    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int st=n/2+1;

System.out.println("stars"+st);
int sp=1;

for(int i=1;i<=n;i++){

for(int j=1;j<=st;j++){
    System.out.print("*\t");
}

    for(int j=1;j<=sp;j++){
        System.out.print("\t");
    }


    for(int j=1;j<=st;j++){
        System.out.print("*\t");
    }

    if(i<=(n/2)){
        // 1st half
        st--;
        sp+=2;

    }
    else{
        st++;
        sp-=2;
    }

    System.out.println();
}



    }
}
