package by.academy.lesson6;

public class StringBuilderDemo {
    public static void main(String[] args) {

//        StringBuilder a = new StringBuilder("Java");
//        a.append(" ").append("Java").append(" ").append("!!!").append(123).append('!');
//        System.out.println(a);

        String b = "C#";
        StringBuilder c = new StringBuilder(b);
        System.out.println(c);
        c.setCharAt(1,'+');
        System.out.println(c);

        String d = "не следует";
        StringBuilder d1 = new StringBuilder(d);
        int iS = d1.indexOf("следует");
        d1.replace(iS, iS + "следует".length()," нужно ");

        d1.insert(10, "java");
        System.out.println(d1);

        d1.delete(10,10 + "Java".length());
        System.out.println(d1);

        d1.deleteCharAt(2);
        System.out.println(d1);


    }
}
