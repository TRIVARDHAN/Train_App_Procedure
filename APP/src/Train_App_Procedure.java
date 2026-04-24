import java.util.Arrays;

public class Train_App_Procedure {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Bogie IDs (unsorted input)
        String[] bogieIDs = {
                "BG309",
                "BG101",
                "BG550",
                "BG205",
                "BG412"
        };

        String searchKey = "BG205";

        // Step 1: Sort array (mandatory for binary search)
        Arrays.sort(bogieIDs);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIDs));

        // Step 2: Binary Search
        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIDs[mid].compareTo(searchKey);

            if (comparison == 0) {
                System.out.println("\nBogie Found: " + searchKey + " at index " + mid);
                found = true;
                break;
            }
            else if (comparison < 0) {
                low = mid + 1; // search right half
            }
            else {
                high = mid - 1; // search left half
            }
        }

        if (!found) {
            System.out.println("\nBogie Not Found: " + searchKey);
        }
    }
}