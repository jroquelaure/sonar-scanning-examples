import java.io.*;

public class App {
    
    public String getGreeting(String firstName, String lastName) {
        
         StringBuilder message = new StringBuilder("Hello");

        // Initializing names in case they're missing
        if (firstName == null || lastName == null) {
            try {
            BufferedReader reader = new BufferedReader(new FileReader("default-values.txt"));
            firstName = reader.readLine();
            lastName = reader.readLine();
            }
            catch(IOException e){
                //nothing
            }
        } 


        message.append(" ");
        message.append(firstName);
        message.append(" ");
        message.append(lastName);

          return message.toString();
    }

    public static void main(String[] args) {
       System.out.println(new App().getGreeting("Jon", "Roquelaure"));
    }

}
