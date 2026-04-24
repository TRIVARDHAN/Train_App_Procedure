import java.util.ArrayList;
import java.util.List;

// Reusing Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Train_App_Procedure {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Luxury AC", 80));

        // Calculate total seating capacity using stream + reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Display result
        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);
    }
}