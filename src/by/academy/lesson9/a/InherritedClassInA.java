package by.academy.lesson9.a;

public class InherritedClassInA extends ClassInA{

    @Override
    public void someMethod() {
        System.out.println(super.publicVariable);
        System.out.println(super.variable);
        System.out.println(super.protectedVariable);
    }
}
