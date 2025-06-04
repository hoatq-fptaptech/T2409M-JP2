package demo1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        MathNumber<Integer> m = new MathNumber<>();
        m.A = 5;
        m.B = 6;
        m.name = "Nam";
        MathNumber<Double> n = new MathNumber<>();
        n.A = 3.14;
        n.name = "Tú";
        MathNumber<String> s = new MathNumber<>();
        s.A = "Hello";
        s.name = "Sơn";

        s.calculate(5,4);
        s.calculate("ABC","XYZ");

        ArrayList<String> strArr =  new ArrayList<>();
        ArrayList<Integer> intArr = new ArrayList<>();
        Couple<String,Integer> c = new Couple<>();
    }
}
