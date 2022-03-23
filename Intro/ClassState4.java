class state{
    public  static String country = "india";
}
class ClassState4{
    public static void main(String[] args) {
        state s1 = new state();
        System.out.println(state.country);
        state obj = new state();
        System.out.println(obj.country);
    }
}