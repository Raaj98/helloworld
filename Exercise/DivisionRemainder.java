import java.util.*;
//This is a DivisionRemainder class,used to divide two numbers(find remainder)
class DivisionRemainder{
    public static void main(String[]args){
        //This is a scanner input
        Scanner scan = new Scanner(System.in);
        //asking the user input
        System.out.println("Enter the num1");
        int num1 = scan.nextInt();
        //asking the user input
        System.out.println("Enter the num2");
        int num2 = scan.nextInt();
        //complete the division
        int num3 = num1%num2;
        //print the result
        System.out.println("The Result is" + num3);
    }
}