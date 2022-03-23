class state{
    private final String country = "India";
    private String name;
    private int population;
    state(String name,int population){
        this.name=name;
        this.population=population;
    }
    String getCountry(){
        return country;
    }
}
class ClassState{
    public static void main(String[] args) {
        state s1 = new state("tamilnadu",2000);
        System.out.println(s1.getCountry());
    }
}