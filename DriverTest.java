import java.util.Random;
import java.util.ArrayList;

public class DriverTest {
    public static void main(String[] args){
        System.out.println("AAAAAAAAAAAAAAAA");
        Random rng = new Random();        
        ArrayList<Integer> nums = new ArrayList<>();
        BubbleSort sorter = new BubbleSort();

        int cont = 0;
        while (cont < 10) {
            nums.add(rng.nextInt(20 + 1));
            cont++;
        }

        System.out.println(nums);
        ArrayList<Integer> sortedNums;
        sortedNums = sorter.sort(nums);
        System.out.println(sortedNums);

    }
}
