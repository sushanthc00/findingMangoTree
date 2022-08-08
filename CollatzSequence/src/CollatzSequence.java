import java.util.*;
public class CollatzSequence {

    public static void main(String[] args){

        int n,i=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:  ");
        n=sc.nextInt();
        System.out.println(n);

        while (n>1){

            n= (n%2==0 ? (n/2):(3*n+1));
            i++;
            System.out.println(n);
        }

    }
}
