import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;   // Cylindrical, Rectangular, etc.
    String cargo;  // Petroleum, Coal, etc.

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class Train_App_Procedure {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // List of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Safety validation using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Compliance Check:");
        if (isSafe) {
            System.out.println("Train is SAFE for operation.");
        } else {
            System.out.println("Train is NOT SAFE! Invalid cargo detected.");
        }
    }
}