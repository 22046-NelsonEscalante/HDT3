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



    //////

        MergeSort mergeSort = new MergeSort();
        int n = nums.length;

         System.out.println("Array original:");
        for (int value : nums) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("Array ordenado:");
        mergeSort.sort(nums,0,n-1);
        mergeSort.printArray(nums);
    
    }
}