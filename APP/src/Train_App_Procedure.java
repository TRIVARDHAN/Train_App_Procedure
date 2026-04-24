import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class (custom object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display format
    @Override
    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity;
    }
}

public class Train_App_Procedure {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Sort bogies by capacity (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nBogies sorted by capacity (Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sort bogies by capacity (descending)
        bogies.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\nBogies sorted by capacity (Descending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}