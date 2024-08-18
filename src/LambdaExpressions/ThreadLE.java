package LambdaExpressions;

public class ThreadLE {
    public static void main(String[] args) {
        Runnable  r = () ->{
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
