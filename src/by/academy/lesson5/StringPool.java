package by.academy.lesson5;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        String s4 = s3.intern();
        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));
        System.out.println("s1 == s4 :"+(s1==s4));
        System.out.println(s1.equals(s3));

        System.out.println("CAT".equalsIgnoreCase("cat"));

        System.out.println("I'm learning Java".startsWith("I'm"));
        System.out.println("I'm learning Java".endsWith("I'm"));

        System.out.println("--regionMatches");
        System.out.println("I'm living in Minsk".regionMatches(4,"living",0,6));
        System.out.println("I'm learning Java".contains("I'm"));

        System.out.println("abc".compareTo("bbc"));
        System.out.println("Polina".charAt(0));



    }
}
