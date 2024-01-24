package lesson17.Exeption;

import by.academy.DealHW.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final Pattern p = Pattern.compile("\\w{3,20}");

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException, WrongLoginPasswordExeption {

//        enterCredentials();


        try {
            login("user 1", "123");
            login("user 2", "321");
            login("user 4", "123");
        } catch (WrongLoginPasswordExeption e) {
            System.out.println("Повторите ввод");
        }

    }

    public static void login(String username, String password) throws WrongLoginPasswordExeption {

        Map<String, String> users = new HashMap<>();
        users.put("user 1", "123");
        users.put("user 2", "321");
        users.put("user 3", "456");

        if (username != null && password != null) {
            if (users.containsKey(username) && password.equals((users.get(username)))) {
                System.out.println("Вы вошли в систему");
            } else {
                throw new WrongLoginPasswordExeption("Нет такого пользователя");
            }
        }
    }

    public static void registration(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        Matcher mLogin = p.matcher(login);
        if (login == null || !mLogin.matches()) {
            throw new WrongLoginException("Incorrect login");
        }
        Matcher mPassword = p.matcher(password);
        if (password == null || !mPassword.matches()) {
            throw new WrongPasswordException("Incorrect password");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Incorrect password");
        }
        System.out.println("Пользователь создан");
    }

    public static boolean enterCredentials() {
        Scanner sc = new Scanner(System.in);

        String login = sc.next();
        String password = sc.next();
        String confirmPassword = sc.next();
        try {
            registration(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            return false;
        } finally {
            sc.close();
        }
        return true;
    }
}