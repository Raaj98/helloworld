class student{
    public int studentRollNo;
    public String studentName;
    private boolean is_present = true;

    student(int studentRollNo,String studentName){
        this.studentRollNo = studentRollNo;
        this.studentName = studentName;
    }
    void setAttendance(){
        this.is_present = false;
    }
    boolean getAttendance(){
        return this.is_present;
    }
}
class ClassExample2{
    public static void main(String[] args) {
        student s1 = new student(20,"sethu");
        System.out.println(s1.getAttendance());
        System.out.println(s1.studentRollNo);
        s1.setAttendance();
        System.out.println(s1.getAttendance());
    }
}