import java.util.*;
class Forloop{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value a");
        int a = scan.nextInt();
        System.out.println("enter value b");
        int b = scan.nextInt();
        for (int i=a;i<=b;++i){
            System.out.println(i);
        }
    }
}