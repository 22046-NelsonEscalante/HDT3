import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DriverProgram {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        NumberGenerator rng = new NumberGenerator();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> strNumbers = new ArrayList<>();

        System.out.println("PRUEBA DE TIEMPOS DE ALGORITMOS DE ORDENAMIENTO");
        System.out.println("Ingrese cuántos números desea generar para la prueba: ");
        int quantity = Integer.parseInt(in.nextLine());
        System.out.println("Generando números...");
        rng.Generate(quantity);
        System.out.println("Números generados con éxito.");
        try {
            strNumbers = FileReader("numbers.txt");
            for (String s : strNumbers) {
                int i = Integer.parseInt(s);
                numbers.add(i);
            }
        } catch (Exception e) {
            System.out.println("No se ha encontrado el archivo de texto. Error fatal!.");
            System.exit(0);
        }
        System.out.println("Ahora, se ordenarán los números usando distintos algoritmos de ordenamiento.");
        System.out.println("GNOME SORT");
        System.out.println("MERGE SORT");
        System.out.println("QUICK SORT");
        System.out.println("RADIX SORT");
        System.out.println("BUCKET SORT");

        in.close();
    }

    public static ArrayList<String> FileReader(String path) throws Exception{
        ArrayList<String> numbers = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(line);
            }
            reader.close();
            return numbers;
        } catch (IOException e) {
            throw new Exception();
        }
    }
}
