import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FromFileFill personReader = new FromFileFill();
        try {
            Employee[] employees = personReader.readPersons("produkty.csv");
            for (Employee employee : employees) {
                System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getId() + " " + employee.getCategory() + " " + employee.getPayment());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");
        }
        //druga część zadania
        String fileName = "testFile.txt";
        try (var fileWriter = new FileWriter(fileName);
             var writer = new BufferedWriter(fileWriter)) {
            Employee[] employees = personReader.readPersons("produkty.csv");

            writer.write("Średnia wypłata: " + Method.average(employees));
            writer.newLine();
            writer.write("Najmniejsza wypłata: " + Method.lowest(employees));
            writer.newLine();
            writer.write("Najwyższa wypłata: " + Method.highest(employees));
            writer.newLine();
            writer.write("Łączna liczba pracowników " + employees.length);
            writer.newLine();
            writer.write("Pracownicy w IT " + Method.numberIT(employees));
            writer.newLine();
            writer.write("Pracownicy w support " + Method.numberS(employees));
            writer.newLine();
            writer.write("Pracownicy menadżerowie  " + Method.numberM(employees));
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);
        }
    }
}

