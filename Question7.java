import java.util.Scanner;

class triangle{
       public float triarea(float a, float b, float c){
           float s=(a+b+c)/2f;
           float area=(float)Math.sqrt((s*(s-a)*(s-b)*(s-c)));
           return (float)area;
       }
}
public class Question7 {
    public static void main(String[] args) {
        triangle t=new triangle();
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        System.out.println(t.triarea(a,b,c));
    }
}
