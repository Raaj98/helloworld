import java.util.*;
class Ifcondition3{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = scan.nextInt();
        System.out.println("Enter the value of b");
        int b = scan.nextInt();
        if (a<=b){
            System.out.println("a is less than b");
        }
        if (a>=b){
            System.out.println("a is greater than b");
        }
    }
}