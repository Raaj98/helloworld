class car{
    private int noOfMirror;

    int getChangeMirror(){
        return noOfMirror;
    }
    void setChangeMirror(int Mirror) {
        this.noOfMirror = Mirror;
    }

    public int noOfSeats;
    public String fuelType;
    public  String engineName;
    car(int Mirror,int Seats,String fuelType,String engineName){
        this.noOfMirror=Mirror;
        this.noOfSeats=Seats;
        this.fuelType=fuelType;
        this.engineName=engineName;
    }

}
class ClassExample{
    public static void main(String[] args) {
    car obj1 = new car(3,6,"petrol","revotron");
    System.out.println(obj1.getChangeMirror());
    obj1.setChangeMirror(5);
    System.out.println(obj1.getChangeMirror());
    }
}