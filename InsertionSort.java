import java.util.Arrays;
public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        int[] output = new int[input.length];
        for (int i=0; i<output.length;i++){
            for (int j=0; j<i;j++){
                if (input[j]<input[i]){
                    output[j] = input[j];
                }
            }
        }
        input = output;
        System.out.println(Arrays.toString(output));
    }
}
