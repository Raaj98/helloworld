class state {
    public final String country;

    state(String country) {
        this.country = country;
    }
    String getCountry(){
        return country;
    }
}

  class ClassState3{
      public static void main(String[] args) {
          state s1 = new state("india");
          System.out.println(s1.country);
          System.out.println(s1.getCountry());
      }
  }