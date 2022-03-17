import java.util.*;
class Whileloop1{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("the value a");
        int a = scan.nextInt();
        System.out.println("the value b");
        int b = scan.nextInt();
        System.out.println("the value c");
        int c = scan.nextInt();
        while (a<=b) {
            if (a%c == 0) {
                System.out.println(a);
                }
            a++;
        }
    }
}