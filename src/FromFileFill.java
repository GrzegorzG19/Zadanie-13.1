import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FromFileFill {

    Employee[] readPersons(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = countLines(fileName);
        Employee[] employees = new Employee[lines];
        int i = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            String[] split = nextLine.split(";");
            employees[i] = new Employee(split[0], split[1], Double.valueOf(split[2]), split[3], Double.valueOf(split[4]));
            i++;
        }
        return employees;
    }

    private int countLines(String fileName) throws FileNotFoundException {
        int noOfLines = 0;
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            noOfLines++;
            scanner.nextLine();
        }
        scanner.close();
        return noOfLines;
    }
}

