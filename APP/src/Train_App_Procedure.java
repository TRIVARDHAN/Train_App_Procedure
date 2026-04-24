public class Train_App_Procedure {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("\nBefore Sorting:");
        printArray(capacities);

        // Bubble Sort (manual implementation)
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {
                    // swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter Sorting (Bubble Sort):");
        printArray(capacities);
    }

    // Utility method to display array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}