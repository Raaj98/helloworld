import java.util.*;
class Arrays{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String[] cars ={"volvo","mg","tata","hyundai"};
        System.out.println("enter the car a");
        String a = scan.nextLine();
        for(int i = 0;i<cars.length;i++) {
            System.out.println(cars[i]);
            if (cars[i].equals(a)) {
                continue;
            }
        }
    }
}