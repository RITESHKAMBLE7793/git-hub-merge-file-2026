import java.util.*;
public class second {
    public static int rit(int a){
        int no=1;
        for(int i=1;i<=a;i++){
            no=i*no;
        }
        System.out.println(no);
        return no;
    }
public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    int var1=input.nextInt();
    rit(var1);
    
}
}
