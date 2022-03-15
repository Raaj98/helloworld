import java.util.*;
class Ifconditionodd{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = scan.nextInt();
        if (a%2==1){
            System.out.println("a is a odd number");
        }
        else {
            System.out.println("a is a even number");
        }
    }
}