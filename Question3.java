import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream; 
class employee{
    int Id, Salary ;
    String Name,Designation,Location;
    public employee(int Id,int Salary,String Name,String Desig,String Location) {
        this.Id=Id;
        this.Salary=Salary;
        this.Name=Name;
        this.Designation=Desig;
        this.Location=Location;
    }

}
public class Question3{
    public static void main(String[] args) {
        List<employee> l=new ArrayList<employee>();
        l.add(new employee(1, 45000,"Aniket","salesman","Lumding"));
        l.add(new employee(2, 65000,"Arjun","product manager","Delhi"));
        l.add(new employee(3, 20000,"Paromesh","HR","Guwahati"));
        l.add(new employee(4, 70000,"Saikat","analyst","Mumbai"));
        l.add(new employee(5, 68000,"Ashok","Director","Ajmer"));
        l.add(new employee(6, 30000,"Aditya","CEO","Patna"));
        l.add(new employee(7, 10000,"Krishna","CTO","Kerala"));
        l.add(new employee(8, 18000,"Birjit","product designer","Manipal"));
        l.add(new employee(9, 48000,"Vivek","Trainee","shillong"));
        l.add(new employee(10, 92000,"Rohit","project manager","Vishakhapatnam"));

        List<String> s=l.stream().map(n->n.Name).collect(Collectors.toList());
        System.out.println(s);
        System.out.println();
        l.stream().filter(n->n.Salary > 50000).forEach(c->System.out.println(c.Salary));;
        System.out.println();
        l.stream().filter(n->n.Location.charAt(0)=='M').forEach(c->System.out.println(c.Location));;
        System.out.println();
        l.stream().filter(n->n.Designation.endsWith("e")).forEach(c->System.out.println(c.Designation));;
    }
}