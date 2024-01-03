package by.academy.lesson13;

public class User {

    private static int login;
    private int password;
    private String name;

    public User(int login, int password, String name){
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public void createQuery(){
        Query query = new Query(this);
        query.printToLog();
    }

    static class Query {
        private User user;
        public Query (User user) {
            this.user = user;
        }
        public void printToLog(){
            System.out.println("Пользователь " + user.getName() + " с логином " + user.getLogin() + " паролем " + user.getPassword() + " отправил запрос");
        }
    }

    public static int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        User user = new User(123, 124, "a");
        user.createQuery();

        Query query = new User.Query(user);
        query.printToLog();


//        Query query1 = user.new Query();
//        query1.printToLog();

//        Query query2 = new User(123,456,"b").new Query();
//        query2.printToLog();
    }
}
