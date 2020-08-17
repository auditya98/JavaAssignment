interface addable{
    int add(int a, int b);
}
interface difference{
    int diff(int a, int b);
}
interface product{
    int prod(int a, int b);
}
interface safedivision{
    int diff(int a, int b);
}

public class calculate {
    public static void main(String[] args) {
        addable ad1 = (int a, int b) -> {
            return (a + b);
        };
        difference dif=(int a, int b)->{
            return (a-b);
        };
        product pro=(int a, int b)->{
            return (a*b);
        };
        safedivision sfd=(int a, int b)->{
            return (a/b);
        };
        System.out.println(ad1.add(40,20));
        System.out.println(dif.diff(40, 20));
        System.out.println(pro.prod(40, 20));
        System.out.println(sfd.diff(40, 20));
    }
}