import java.util.*;
//This is a addition class,used to add three numbers
class Addition{
    public static void main(String[]args){
        //This is scanner input
        Scanner scan = new Scanner(System.in);
        //asking the user input
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        //asking the user input
        System.out.println("Enter num2");
        int num2 = scan.nextInt();
        //asking the user input
        System.out.println("Enter num3");
        int num3 = scan.nextInt();
        //complete the addition
        int num4 = num1+num2+num3;
        //print the result
        System.out.println("The Result is" + num4);
    }
}