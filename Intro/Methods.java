import java.util.*;
class Methods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

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


