package MethodAndConstructorRef.ConstructorRef;

public class Main {
    public static void main(String[] args) {

//        Using Lambda Expression to get Student Object.
        Provider provider = ()-> new Student();

//        Using Constructor Reference to get Student Object.
        Provider provider1 = Student::new;
        Student std = provider1.getStudent();
        std.viewStd();
    }
}
