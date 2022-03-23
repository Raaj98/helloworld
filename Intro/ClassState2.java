class state{
    private String country;

    state(String country){
        this.country=country;
    }
    String getCountry(){
        return country;
    }
    void setCountry(String country){
        this.country=country;
    }
}
class ClassState2{
    public static void main(String[] args) {
        state s1 = new state("india");
        System.out.println(s1.getCountry());
        s1.setCountry("china");
        System.out.println(s1.getCountry());
    }
}