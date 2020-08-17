import java.util.Scanner;
class Rectangle{
    int width,height;
    void display() {
        System.out.println(width+" "+height);
    }
}
class RArea extends Rectangle {
    void input() {
        Scanner sc=new Scanner(System.in);
        this.width=sc.nextInt();
        this.height=sc.nextInt();
    }
    void display(int k) {
        System.out.println(width*height);
    }
}

public class Question2 {
    public static void main(String[] args) {
        int k=0;
        RArea r=new RArea();
        r.input();
        r.display();
        r.display(k);
    }
}