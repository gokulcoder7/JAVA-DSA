


 import java.util.*;



public class gokul {



    public static void main(String[] args) {



      List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(1);

int n=19;
        for(int i = 2; i < n; i++){
            l.add(l.get(i - 2) + l.get(i - 1)); // dynamic programming algorithm
        }
System.out.println(l);
//[1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181]

    }


 }


