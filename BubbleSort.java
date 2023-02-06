import java.util.ArrayList;

public class BubbleSort {
    
    public ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        ArrayList<Integer> sortedNumbers = new ArrayList<>();
        sortedNumbers.addAll(numbers);

        int size = sortedNumbers.size() - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (sortedNumbers.get(j) > sortedNumbers.get(j+1)) {
                    int temp = sortedNumbers.get(j);
                    sortedNumbers.set(j, sortedNumbers.get(j+1));
                    sortedNumbers.set(j+1, temp);
                }
            }
        }
        

        return sortedNumbers;
    }
}
