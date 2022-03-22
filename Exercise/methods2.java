import java.util.*;
class methods2{
      public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("side a");
       double a = scan.nextDouble();
        System.out.println("side b");
       double b = scan.nextDouble();
          double area=area(a,b);
          System.out.println(area);

    }
        static double area(double a,double b){
       double  area = 0.5 * (a * b);
       return area;
        }
}