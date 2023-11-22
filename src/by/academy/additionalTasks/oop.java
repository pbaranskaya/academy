package by.academy.additionalTasks;

// Напишите метод, заменяющий в строке каждое второе вхождение
// «object-oriented programming» (не учитываем регистр символов) на «OOP».
// Например строка:
// "Object-oriented programming is a programming language model organized around objects rather than
// "actions" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
// должна быть преобразована в
// "Object-oriented programming is a programming language model organized around objects rather than "actions"
// and data rather than logic. OOP blabla. Object-oriented programming bla."

public class oop {

//    public static String oop (String str, String pattern) {
//        str = str.toLowerCase();
//        pattern = pattern.toLowerCase();
//        int i = str.indexOf(pattern);
//        int n = 0;
//        String new_str = new String();
//        while (i >= 0) {
//            n++;
//            i = str.indexOf(pattern, i + 1);
//            if (n % 2 == 0) {
//                new_str = str.replace(pattern, "oop"); // как заменить именно в четном n?
//            }
//        }
//        return new_str;
//    }


//    public static void main(String[] args) {
//
//        String text = "Object-oriented programming is a programming language model organized " +
//                "around objects rather than 'actions' and data rather than logic. Object-" +
//                "oriented programming blabla. Object-oriented programming bla.";
//
//
//
//        StringBuilder sb = new StringBuilder();
//        String source = "Object-oriented programming";
//        String target = "OOP";
//
//        int start = 0;
//        int end = 0;
//        int counter = 0;
//
//        int startIndex = text.indexOf(target);
//        int indCounter = 0;
//
//        do {
//            int found = text.indexOf(source,end);
//            end = found + source.length();
//            if (start < found) {
//                sb.append(text.substring(start, found));
//            }
//            start = found;
//            if (found >= 0) {
//                counter++;
//                if (counter % 2 == 1) {
//                    sb.append(source);
//                } else {
//                    sb.append(target);
//                }
//            }
//        } while (start >= 0);
//        System.out.println(sb);
//    }
//}

    public static String replaceEachOther(String str, String word, String replacement) {
//        word = "\\Q" + word + "\\E";
        return str.replaceAll("(?siu)(" + word +".*?)" + word, "$1" + replacement);
    }

    public static void main(String[] args) {
        String str = ("Object-oriented programming is a programming language model "
                + "organized around objects rather than 'actions' and data rather than logic. "
                + "Object-oriented programming blabla. Object-oriented programming bla.");

        System.out.println(replaceEachOther(str, "Object-oriented programming", "OOP"));

    }
}
