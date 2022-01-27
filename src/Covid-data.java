import java.io.*;
import java.util.Scanner;

public class Main {

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

        // TODO obtain parsing keywords (country, variant) for selecting lines
        System.out.println("Country: ");
        String country = scnr.nextLine();

        System.out.println("Variant: ");
        String variant = scnr.nextLine();

        while (inputFileNameScanner.hasNext()) {
            String line = inputFileNameScanner.nextLine();
            String[] parts = line.split(",");

            // TODO: print out the date and perc_sequences for the selected lines
        }
        inputFileNameStream.close();
    }
}
