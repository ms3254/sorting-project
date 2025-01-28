import java.util.Arrays;
public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        for (int i=1; i<input.length;i++){
            int point = input[i];
            int j = i-1;
            while (input[j]>point && j>=0){
                    input[j+1] = input[j];
                    j--;
            }
            input[j+1]=point;
        }
        System.out.println(Arrays.toString(input));
    }
}
