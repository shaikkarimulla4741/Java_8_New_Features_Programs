package FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerInterfaceMain {
    public static void main(String[] args) {
        Consumer<String> consumer= new ConsumerInterfaceClass();
        consumer.accept("Hello");

//        Anonymous Class
        Consumer<String > consumer1 = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "Consumer Interface implementation using Anonymous Class");
            }
        };
        consumer1.accept("Hello");

//        Lambda Expressions
        Consumer<String> consumer2 = (s) -> System.out.println(s + "Consumer Interface implementation using Lambda Expressions");
        consumer2.accept("Hello");

    }
}

class ConsumerInterfaceClass implements Consumer<String>{


    @Override
    public void accept(String string) {
        System.out.println(string + "Consumer Interface implementation using Normal Class");

    }
}