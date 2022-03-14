import java.util.*;
//This is DivisionQuotient class,used to divide two numbers (find quotient)
class DivisionQuotient{
    public static void main(String[]args){
        //This scanner input
        Scanner scan = new Scanner(System.in);
        //asking the user input
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        //asking the user input
        System.out.println("Enter num2");
        int num2 = scan.nextInt();
        //complete the division
        int num3 = num1/num2;
        //print the result
        System.out.println("The Result is" + num3);
    }
}