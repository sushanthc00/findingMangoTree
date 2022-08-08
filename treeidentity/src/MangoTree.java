import java.sql.SQLOutput;
import java.util.*;

public class MangoTree {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the row : ");
        int row=sc.nextInt();
        System.out.println("Enter the size of the column : ");
        int column=sc.nextInt();
        System.out.println("Enter the tree number : ");
        int treenum=sc.nextInt();
        int r,c,holder=0;

        for( r=1; r <= row; r++){
            if(r==1){
                for( c=1; c<= column; c++){
                    if(treenum== r*c){
                        holder=1;
                        break;
                }

            }
        }
            if(r==row){
                for(c=1;c<= column; c++){
                    if(treenum == r*c || treenum == (r*c)+1) {
                        holder=1;
                        break;
                    }

                }


            }
        }
    if(holder==1){
        System.out.println("Yes, it is a Mango tree");
    }
    else{
        System.out.println("No, it is not a Mango tree");
    }
    }
}
