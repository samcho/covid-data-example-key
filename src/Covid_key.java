import java.io.*;
import java.util.Scanner;

public class Covid_key {

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        System.out.println("COVID variants filename?: ");
        String inputFileName = scnr.nextLine();

        // For file input
        String fileName;
        FileInputStream inputFileNameStream = null;
        Scanner inputFileNameScanner = null;

        // Open the input file
        inputFileNameStream = new FileInputStream(inputFileName);
        inputFileNameScanner = new Scanner(inputFileNameStream);

        // ignore first line
        inputFileNameScanner.nextLine();

        // Obtain parsing keywords (country, variant) for selecting lines
        System.out.println("Which country?: ");
        String country = scnr.nextLine();

        System.out.println("Which variant?: ");
        String variant = scnr.nextLine();

        while (inputFileNameScanner.hasNext()) {
            String line = inputFileNameScanner.nextLine();
            String[] parts = line.split(",");

            // Print out the date and perc_sequences for the selected lines
            if (country.equals(parts[0]) && variant.equals(parts[2])) {
                System.out.println(parts[1] + "," + parts[4]);
            }
        }
        inputFileNameStream.close();
    }
}
