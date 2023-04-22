public class UserTest {

    public static void main(String[] args) {
        User user = new User("Piotr", "Hello");

        System.out.println(user.username);
        System.out.println(user.password);

        user.sayHello();
    }
}
