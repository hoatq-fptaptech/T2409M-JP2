package demo1;

public class MathNumber <K> {
    K A;
    K B;

    String name;
    public void total(){
        if(A instanceof Integer){
            int a = (int)A;
            int b= (int)B;
            System.out.println(a+b);
        }else if(A instanceof Double){
            double a = (double) A;
            double b = (double) B;
            System.out.println(a+b);
        }
    }

    public <X> void calculate(X a, X b){
        System.out.println(a);
        System.out.println(b);
    }
}
