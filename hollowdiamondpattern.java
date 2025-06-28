// hollowdiamondpattern.java
// 7
// 			*	
// 		*		*	
// 	*				*	
// *				 *	
// 	*				*	
// 		*		*	
// 			*	
7
			*	
		*		*	
	*				*	
*						*	
	*				*	
		*		*	
			*	

// Process finished with exit code 0



  
 import java.util.*;
public class gokul {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

int is=-1;
int os=n/2;



        for(int i=1;i<=n;i++){
//    Inner space, outer space

            for(int j=1;j<=os;j++){


                System.out.print("\t");
            }


            System.out.print("*\t");


            for(int j=1;j<=is;j++){


                System.out.print("\t");
            }





            if(i<=n/2){
                
                is+=2;
                os-=1;

            }
            else{


                is-=2;
                os+=1;

            }

            if(i>1 && i<n){


                System.out.print("*\t");
            }


            System.out.println();
        }



    }
}




