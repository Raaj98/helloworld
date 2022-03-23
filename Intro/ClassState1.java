class state {
    public String country;
    public int population;

    state(String country, int population) {
        this.country = country;
        this.population = population;
    }
    String getCountry(){
        return country;
    }
    void setCountry(String country){
        this.country=country;
    }
}
class ClassState1{
    public static void main(String[] args) {
        state s1 = new state("india",20000);
        System.out.println(s1.country);
        s1.country="iran";
        System.out.println(s1.country);
        s1.setCountry("china");
        System.out.println(s1.getCountry());
    }
}