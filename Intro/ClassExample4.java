class zoo {
    public double noOfLions;
    public double noOfTiger;
    private boolean is_waterPresent = true;
    private double noOfElephants;

    zoo(double lions, double tiger, double elephants) {
        this.noOfLions = lions;
        this.noOfTiger = tiger;
        this.noOfElephants = elephants;
    }
    void setIs_waterPresent() {
        this.is_waterPresent = false;
    }
    boolean getIs_waterPresent() {
        return is_waterPresent;
    }
    void setNoOfElephants(double noOfElephants){
        this.noOfElephants=noOfElephants;
    }
    double getNofElephants(){
        return noOfElephants;
    }
}
class ClassExample4{
    public static void main(String[] args) {
        zoo z1 = new zoo(20,25,18);
        System.out.println("the water is present");
        System.out.println(z1.getIs_waterPresent());
        System.out.println("now present elephants are");
        System.out.println(z1.getNofElephants());
        z1.setIs_waterPresent();
        z1.setNoOfElephants(10);
        System.out.println("the water not present");
        System.out.println(z1.getIs_waterPresent());
        System.out.println("now present elephants are");
        System.out.println(z1.getNofElephants());
    }
}