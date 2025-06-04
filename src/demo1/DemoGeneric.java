package demo1;

import java.util.ArrayList;

public class DemoGeneric{
    public static void main(String[] args){
        ArrayList<VietStudent> vArr = new ArrayList<>();
        vArr.add(new VietStudent());

        ArrayList<? extends VietStudent> arr = new ArrayList<>();
//        arr.add(new VietStudent());
//        arr.add(new Student());

        ArrayList<? super VietStudent> sarr = new ArrayList<>();
//        sarr.add(new Student());
        sarr.add(new VietStudent());
        sarr.add(new FPTStudent());
    }
}
