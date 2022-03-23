class Employee{
    int id;
    String name;
   private double salary;
    void insert(int i, String n, float s) {
        id=i;
        name=n;
        salary=s;
    }
    double getSalary() {
        return salary;
    }
        void setSalary(double salary){
            this.salary=salary;
        }
    void display(){
        System.out.println(id + name + salary);
    }
}
public class ClassEmployee {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e1.insert(101,"ajeet",45000);
        e1.setSalary(5);
        e2.insert(102,"irfan",25000);
        e3.insert(103,"nakul",55000);
        e1.display();
        e2.display();
        e3.display();
        System.out.println(e1.getSalary());
    }
}