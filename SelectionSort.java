import java.util.Arrays;
public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");
        for (int i=0;i<input.length;i++){
            for (int j=1;j<input.length;j++){
                if (input[j]<input[i]){
                    int inputI = input[i];
                    input[i] = input[j];
                    input[j] = inputI;
                    i=j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }
}
