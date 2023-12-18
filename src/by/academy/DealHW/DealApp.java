package by.academy.DealHW;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DealApp  {
    private static final Validator EMAIL_VALIDATOR = new EmailValidator();
private static final DateValidatorFormat1 date1 = new DateValidatorFormat1();
private static final DateValidatorFormat2 date2 = new DateValidatorFormat2();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Deal deal= new Deal();
        System.out.println("Добро пожаловать");
        while(true) {
            String action = sc.next();
            switch (action) {
                case "1":
                    System.out.println("создаем продавца");
                    deal.setSeller(createUser(sc));
                case "2":
                    System.out.println("создаем покупателя");
                    deal.setBuyer(createUser(sc));
                case "3":
                    //распечатать карзину продуктов
                    deal.printProducts();
                case "4":
                    // добавить продукт в дил
                    Product p = createProduct(sc);
                    if(p != null) {
                        deal.add(p);
                    }else {
                        System.out.println("Зина отмена");
                    }
                case "5":
                    //удалить продукт ил дил
                case "0":
                    break;
            }
        }




//        switch () {
//            case "1":
//            case "2":
//            case "3":
//            case "4":
//        }
    }

    public Product createProduct(Scanner sc) {

        System.out.println("Ыыедите номер продукта для покупки");
        System.out.println("1-огурец, 2-помидор, 3 самолет, 0 - для отмены");
        Product product = null;

switch (sc.next()) {
    case "1":
        System.out.println("Введите количество");
        int quantity = sc.nextInt();
        product = new Tea(quantity, "green", "warm");
}
return product;
    }
    public static LocalDate parseFormat1 (String date) {
        return LocalDate.now();
    }

    public static LocalDate parseFormat2 (String date) {
        return LocalDate.now();
    }

public static User createUser(Scanner sc) {
    System.out.println("Ввод имени");
    String name = sc.next();

            System.out.println("Ввод email");
            String email = null;
            while(email== null) {

                email = sc.next();
              if(!EMAIL_VALIDATOR.validate(email)) {
                email = null;
                    System.out.println("email not correct enter again");
              }
            }

            System.out.println("Ввод телефона");

            System.out.println("Ввод дата рождения");
            LocalDate date = null;
            while(date == null) {
                String dateStr = sc.nextLine();

                if (date1.validate(dateStr)) {
                    date = parseFormat1(dateStr);
                } else if (date2.validate(dateStr)) {
                    date = parseFormat1(dateStr);
                } else {
                    date  = null;
                    System.out.println("Неправильная дата");
                }
            }

            System.out.println("Ввод дата рождения");
        }
    User user = new User(name, , asdasd,asd,as,dasdas);

    return user;
}


}
