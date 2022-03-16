import java.util.*;
class Greetingsif{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("day");
        String day = scan.nextLine();
        if (day.equals("monday")){
            System.out.println("hello buddy have a great day");
        }
        else if (day.equals("tuesday")){
            System.out.println("hai have a nice day");
        }
        else if (day.equals("wednesday")){
            System.out.println("whats app buddy");
        }
        else if (day.equals("thursday")){
            System.out.println("how are you buddy");
        }
        else if (day.equals("friday")){
            System.out.println("super day");
        }
        else if (day.equals("saturday")){
            System.out.println("santhosam");
        }
        else if (day.equals("sunday")){
            System.out.println("santhosam");
        }
        else {
            System.out.println("invalid day");
        }
    }
}