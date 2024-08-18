package GenericType;

public class GenericTypeMain {
    public static void main(String[] args) {

//        Object is the Parent Class of all Java Classes
//        This an Object type class which accepts any type of data.
//        This doesn't provide type safety as it is Object Type.

        Box box = new Box("Hello guru");
        System.out.println(box.getContainer());
//        It can store different values for same object.
        box.container=1234;
        System.out.println(box.getContainer());

//        Using the Generic Type Clas.
//        The type we specify at the time of Object creation,
//        The Generic Type class only accepts that type of values only.
//        Which helps in Type safety.

        BoxGen<Integer> boxGen = new BoxGen<>(1234);
        System.out.println(boxGen.getContainer());
        boxGen.performTask(1234);

        BoxGen<String> boxGen1 = new BoxGen<>("Hii");
        System.out.println(boxGen.getContainer());
        boxGen1.performTask("Hii");


    }
}
