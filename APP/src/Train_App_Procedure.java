public class Train_App_Procedure {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogieIDs = {}; // Empty dataset (test case scenario)

        String searchKey = "BG101";

        try {
            searchBogie(bogieIDs, searchKey);
        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }

    // Search method with validation
    public static void searchBogie(String[] bogieIDs, String searchKey) {

        // Defensive check
        if (bogieIDs.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in train consist");
        }

        boolean found = false;

        for (String id : bogieIDs) {
            if (id.equals(searchKey)) {
                System.out.println("Bogie Found: " + searchKey);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Bogie Not Found: " + searchKey);
        }
    }
}