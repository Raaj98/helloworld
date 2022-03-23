import java.util.*;
class Methods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter car a");
        String a = scan.nextLine();
        String[] cars = {"volvo", "bmw", "audi", "volvo", "bmw"};
        int x = list(cars,a);
        System.out.println(x);

    }

    static int list(String[] cars, String n) {
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(n)) {
                count++;
            }
        }
        return count;
    }
}

