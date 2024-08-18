package FunctionalInterfaces;

public class FunctionalInterfacesMain {
    public static void main(String[] args) {
//        Runnable Functional Interface Implementation Using Anonymous Class
        Runnable rt = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

//        Runnable Functional Interface Implementation Using Lambda Expression
        Runnable r = () -> System.out.println("Hii");

        Thread t = new Thread(rt);
        t.start();
    }
}

//  Runnable Functional Interface Implementation Using a Class
    class RunImpl implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(1000);System.out.println("hii");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

