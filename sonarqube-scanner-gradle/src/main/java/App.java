/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    
    public String getGreeting() {
        
        while(true){
            System.out.println(new App().getGreeting());
        }
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
