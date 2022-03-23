class building{
  public int noOfFloors;
  public int noOfRooms;
  public boolean have_ac=true;
  private int noOfFamily;
    building(int floors,int rooms,int family){
        this.noOfFloors=floors;
        this.noOfRooms=rooms;
        this.noOfFamily=family;
    }
    int getNoOfPresentFamily(){
        return noOfFamily;
    }
    void setNoOfPresentFamily(int noOfFamily){
        this.noOfFamily=noOfFamily;
    }
}
class ClassExample3{
    public static void main(String[] args) {
        building build1 = new building(4,30,30);
        System.out.println(build1.getNoOfPresentFamily());
        build1.setNoOfPresentFamily(19);
        System.out.println(build1.getNoOfPresentFamily());
    }
}