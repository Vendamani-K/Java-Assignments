package ExceptionHandling.CheckedUncheckedAssignment;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionDemo {

    public void readFile() {

        try {

            File file = new File("ExceptionHandling/CheckedUncheckedAssignment/sample.txt");

            Scanner scanner = new Scanner(file);

            System.out.println("File contents:");

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch (FileNotFoundException e) {

            System.out.println(
                "Checked Exception: File not found!"
            );
        }
    }
}
