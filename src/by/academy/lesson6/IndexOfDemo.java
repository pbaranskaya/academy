package by.academy.lesson6;

public class IndexOfDemo {
    public static void main(String[] args) {
        // Java Java Java. I'm coding Java. Java is the best coding language.

        String text = "Java Java Java. I'm coding Java. Java is the best coding language.";
//        int index = text.indexOf("Java");
//        System.out.println(index);
//        int indexStart = text.indexOf("Java");
//        int size = "Java".length();
//        int indexEnd = indexStart + size;
//        System.out.println("Start: " + indexStart + " End: " + indexEnd);
//
//        int indexStart1 = text.indexOf("Java", indexEnd);
//        int indexEnd1 = indexStart1 + size;
//        System.out.println("Start: " + indexStart1 + " End: " + indexEnd1);

//        int size_new = "Java".length();
//        int indexStart_new = 0;
//        int indexEnd_new = 0;
//        do {
//            indexStart_new = text.indexOf("Java", indexEnd_new);
//            indexEnd_new = indexStart_new + size_new;
//
//            if (indexStart_new >= 0) {
//                System.out.println("Start: " + indexStart_new + " End: " + indexEnd_new);
//            }
//        } while(indexStart_new >= 0);
//
//
//        int lastIndexStart = text.lastIndexOf("Java");
//        System.out.println("last Index: " + lastIndexStart);


        int size_l = "Java".length();
        int iS = text.length();
        int iE = 0;
        do {
            iS = text.lastIndexOf("Java", iS - 1);
            iE = iS + size_l;

            if (iS >= 0) {
                System.out.println("Start: " + iS + " End: " + iE);
            }
        } while(iS >= 0);

//        String replace = text.replace("Java", "JS");
//        System.out.println(replace);
//
//        String upperCaseJava = "JAVA";
//        System.out.println(upperCaseJava);
//        System.out.println(upperCaseJava.toLowerCase());
//
//        String lowerCaseJava = "java";
//        System.out.println(lowerCaseJava);
//        System.out.println(lowerCaseJava.toUpperCase());




    }
}
