public class Train_App_Procedure {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs (unsorted)
        String[] bogieIDs = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // Search key
        String searchKey = "BG309";

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIDs.length; i++) {

            if (bogieIDs[i].equals(searchKey)) {
                System.out.println("Bogie Found: " + searchKey + " at index " + i);
                found = true;
                break; // early termination
            }
        }

        if (!found) {
            System.out.println("Bogie Not Found: " + searchKey);
        }
    }
}