import java.util.*;
class Forloopeven{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value a");
        int a = scan.nextInt();
        System.out.println("enter value b");
        int b = scan.nextInt();
        System.out.println("enter value c");
        int c = scan.nextInt();
            for (int i=a;i<=b;i++){
                if (i%c==0){
                    System.out.println("The even number" + i);
                }
            }
    }
}