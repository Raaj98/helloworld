import java.util.*;
class Try{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = scan.nextInt();
        System.out.println("Enter the num2");
        int num2 = scan.nextInt();
        int num3 = num1/num2;
        int num4 = num1%num2;
        System.out.println("The Result is " + num3);
        System.out.println("The Result is " + num4);
    }
}