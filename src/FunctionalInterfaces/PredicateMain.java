package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
//        Normal Class
        Predicate<String> predicate = new PredicateClass();
        if (predicate.test("Hell")) {
            System.out.println("Predicate Interface Implementation Using Normal Class");
            System.out.println("This line gets printed if the test is true");
        }else System.out.println("This line gets printed if the test is false");

//        Anonymous Class
        Predicate<String> stringPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==5;
            }
        };
        if (stringPredicate.test("Hello")) {
            System.out.println("Predicate Interface Implementation Using Anonymous Class");
            System.out.println("This line gets printed if the test is true");
        }else System.out.println("This line gets printed if the test is false");

//        Lambda Expression
        Predicate<String> predicate1 = s -> s.length()<5;
        if (predicate1.test("Hell")) {
            System.out.println("Predicate Interface Implementation Using Lambda Expressions");
            System.out.println("This line gets printed if the test is true");
        }


    }

}


class PredicateClass  implements Predicate<String>{

    @Override
    public boolean test(String s) {
        return s.length()<5 ;
    }
}