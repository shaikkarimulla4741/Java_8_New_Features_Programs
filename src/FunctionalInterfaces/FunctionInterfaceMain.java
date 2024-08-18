package FunctionalInterfaces;

import java.util.function.Function;

public class FunctionInterfaceMain {
    public static void main(String[] args) {
//        Function Interface Implementation Uisng Lambda Expression.
        Function<String,Integer> lE = (s) -> s.length() ;

        Function f= new FI();
        System.out.println(lE.apply("String"));
        System.out.println(f.apply("String"));
    }
}

// Function Interface Implementation Using Class.
 class FI implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}