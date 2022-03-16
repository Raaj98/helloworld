import java.util.*;
class Greetings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what day");
        String day = scan.nextLine();
        switch (day) {
            case "monday": {
                System.out.println("hello buddy have a great day");
                break;
            }
            case "tuesday": {
                System.out.println("hai have a nice day");
                break;
            }
            case "wednesday": {
                System.out.println("whats app buddy");
                break;
            }
            case "thursday": {
                System.out.println("how are you buddy");
                break;
            }
            case "friday": {
                System.out.println("super day");
                break;
            }
            case "saturday": {
                System.out.println("santhosam");
                break;
            }
            case "sunday": {
                System.out.println("maja ahaya");
                break;
            }
            default:{
                System.out.println("invalid day");
                break;
            }
        }
    }
}