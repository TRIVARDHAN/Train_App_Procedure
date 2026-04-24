import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        // Create dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            bogies.add(new Bogie("Bogie-" + i, (i % 100) + 20));
        }

        // ---------------- LOOP BASED FILTER ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM BASED FILTER ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------------- OUTPUT ----------------
        System.out.println("\nLoop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("\nExecution Time:");
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");

        System.out.println("\nBoth results match: " +
                (loopResult.size() == streamResult.size()));
    }
}