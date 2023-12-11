package by.academy.lesson9.b;

import by.academy.lesson9.a.ClassInA;

public class ClassInBWithoutInheritance {

    public void someMethod() {
        ClassInA a = new ClassInA();
        System.out.println(a.publicVariable);
    }
}
