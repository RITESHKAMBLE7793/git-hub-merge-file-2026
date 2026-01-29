import java.util.*;
// public class first{
//     public static void name(String nm){
//         System.out.println(nm);
//         // retur
//     }
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         String nam=input.next();
//         name(nam);
//     }
// }

import java.util.*;

public class first {
    public static int name(int nm, int no) {
        int add = nm + no;
        System.out.println(add);
        return add;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nam = input.nextInt();
        int number = input.nextInt();
        name(nam, number);
    }
}
