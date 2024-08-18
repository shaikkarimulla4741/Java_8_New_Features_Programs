package LambdaExpressions;


public class Main {
    public static void main(String[] args) {
//        System.out.println("Starting the Lambda Expressions");

        FirstInterface sC = new InterfaceClass();

//        1st method using a Separate Class to implement the Functional Interface.
//        fI.firstInter();

//        2nd method using Anonymous Class, Classes that doesn't have a name.
//        We can't create an instance for an Interface the instance created below,
//        is for the child anonymous class.
        FirstInterface anoC = new FirstInterface() {
            @Override
            public void firstInter() {
                System.out.println("This is the 2nd  method to implement the Functional Interface");
            }
        };
//        ano.firstInter();

//        3rd method using the Lambda Expressions to implement the Functional Interface.
//        We don't need to specify the method name when using LE, LE is only used for Functional Interfaces.
//        We can remove the parenthesis if there only 1 statement inside the method.
        FirstInterface lE1 = () -> System.out.println("This is the 3rd and best method to implement the Functional Interface");;
        lE1.firstInter();

//        We should call the interface method whatever method we may use to implement the Functional Interface.

//        When using the LE we don't need to specify the return type in main method,
//        Since it implements the FI it recognizes the return type from the FI.
//        We don't even need the return statement.
        Sum lE2 = (a, b) -> (a + b);
        System.out.println(lE2.sum(3,3));
    }
}
