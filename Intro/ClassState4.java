class state{
    public  static String country = "india";
}
class ClassState4{
    public static void main(String[] args) {
        System.out.println(state.country);
        state obj = new state();
        System.out.println(obj.country);
    }
}