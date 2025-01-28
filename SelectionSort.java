import java.util.Arrays;
public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");
        for (int i=0;i<input.length-1;i++){
            int min = i;
            for (int j=i+1;j<input.length;j++){
                if (input[j]<input[min]){
                    min = j;
                }
            }
            int inputI = input[min];
            input[min] = input[i];
            input[i] = inputI;
        }
        System.out.println(Arrays.toString(input));
    }
}
