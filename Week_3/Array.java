package Week_3;

public class Array {
    public static void main(String[] args) {
        int month[] = new int[12]; // Declare and initialize the array

        // Populate the array with the number of days in each month
        month[0] = 31;
        month[1] = 28;
        month[2] = 31;
        month[3] = 30; // April
        month[4] = 31;
        month[5] = 30;
        month[6] = 31;
        month[7] = 31;
        month[8] = 30;
        month[9] = 31;
        month[10] = 30;
        month[11] = 31;

        // Print the number of days in April
        System.out.println("April has " + month[3] + " days.");
    }
}
