import java.util.Arrays;

public class Train_App_Procedure {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Bogie type names
        String[] bogieNames = {
                "Luxury",
                "Sleeper",
                "AC Chair",
                "General",
                "First Class"
        };

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Built-in sorting (no manual logic)
        Arrays.sort(bogieNames);

        System.out.println("\nAfter Sorting (Arrays.sort):");
        System.out.println(Arrays.toString(bogieNames));
    }
}