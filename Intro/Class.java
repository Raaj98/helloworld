class car{
    int year;
    String name;
    int price;
    int model;
}
public class Class{
    public static void main(String[]args){
        car cars = new car();
        cars.year=1998;
        cars.model=23;
        cars.price=30000;
        cars.name="hyundai";
        System.out.println("The make year is"+cars.year +"The name is"+cars.name +"The price is"+cars.price+
                "The model is"+cars.model);
    }
}