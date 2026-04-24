public class Train_App_Procedure {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        GoodsBogie g1 = new GoodsBogie("Cylindrical", null);
        GoodsBogie g2 = new GoodsBogie("Rectangular", null);

        // Safe assignment
        assignCargo(g1, "Petroleum");

        // Unsafe assignment (will trigger exception)
        assignCargo(g2, "Petroleum");

        // Continue program after failure
        assignCargo(g2, "Coal");
    }

    // Cargo assignment logic with safety handling
    public static void assignCargo(GoodsBogie bogie, String cargo) {

        try {
            System.out.println("\nAssigning cargo: " + cargo + " to " + bogie.type);

            // Safety rule
            if (bogie.type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe assignment: Petroleum cannot be loaded into Rectangular bogie"
                );
            }

            bogie.cargo = cargo;
            System.out.println("Cargo assigned successfully.");

        } catch (CargoSafetyException e) {
            System.out.println("ERROR: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment process completed for " + bogie.type);
        }
    }
}

// ---------------- CUSTOM RUNTIME EXCEPTION ----------------
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// ---------------- DOMAIN CLASS ----------------
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}