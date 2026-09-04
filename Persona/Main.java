import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Persona p1 = new Persona("Gersom", LocalDate.of(2006, 03, 03), 47224296);     
            p1.Saludar();       
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}