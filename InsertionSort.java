import java.util.Arrays;
public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        int[] output = input;
        for (int i=0; i<input.length;i++){
            for (int j=i; j>0;j--){
                if (input[j]<input[j-1]){
                    output[j-1] = input[j];
                }
            }
        }
        input = output;
        System.out.println(Arrays.toString(output));
    }
}
