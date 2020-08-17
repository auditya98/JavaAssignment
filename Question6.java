import java.util.ArrayList;

class employee{
    String name;
    int year;
    float salary;
    String address;
    employee(String name, int year, String address,float salary){
        this.name=name;
        this.year=year;
        this.address=address;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return this.name + "\t\t" + this.year +"\t\t"+ address;
    }
}
public class Question6 {
    public static void main(String[] args) {
        ArrayList<employee> list=new ArrayList<employee>();
        list.add(new employee("Robert",1994,"64C- WallStreet",50000));
        list.add(new employee("Sam",2000,"68D- WallStreet",35000));
        list.add(new employee("John",1999,"26B- WallStreet",70000));
        System.out.println("Name"+"   "+"Year of joining"+"  "+"Address");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.println();
        }
    }
}
