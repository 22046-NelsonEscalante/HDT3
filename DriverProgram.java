import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DriverProgram {
    
    public static void main(String[] args) {
        
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
