import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NumberGenerator {
    
    public void Generate(int quantity) {
        Random rng = new Random();
        int num;

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("numbers.txt"));
            for (int i = 0; i < quantity; i++) {
                num = rng.nextInt(quantity) + 1;
                writer.write(num);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
