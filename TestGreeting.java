public class TestGreeting {
    public static void main(String[] args) {
        Greetings greeterApp = new Greetings(); // 1
        String dateMessage = greeterApp.getCurrentDate(); // 2
        System.out.println(dateMessage); // 3
    }
}
