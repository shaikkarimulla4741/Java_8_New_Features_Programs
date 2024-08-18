package FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
//        Normal Class
        Supplier<Double> supplier1 = new SupplierClass();
        System.out.println(supplier1.get() + " Supplier Interface Implementation Using Normal  Class ");

        //    Lambda Expression
        Supplier<Double> supplier3 = () -> Math.random();
        System.out.println(supplier3.get()+" Supplier Interface Implementation Using Lambda Expression");

//        Anonymous  Class
        Supplier<Double> supplier2 = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };
        System.out.println(supplier1.get() + " Supplier Interface Implementation Using Anonymous Class ");
    }




}

class SupplierClass implements Supplier<Double>{

    @Override
    public Double get() {
        return Math.random();
    }
}