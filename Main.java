public class Main {
    public static void main(String[] args)
    {
        // Task:
        // 1. Implement missing sorting algorithms.
        //    - InsertionSort.java
        //    - SelectionSort.java
        //
        //  2. Add a method to class Main to generate a random array.
        //  3. Provide random input to test suite and ensure your implementations
        //     of InsertionSort and Selection sort continue to work.
        //  4. Increase the loop count for TestSuite to get better performance results.

        int[] testInput = arrayCreator();

        // Increase the loop count to get better results once it works.
        // TestSuite.run(testInput, 10000);
        TestSuite.run(testInput, 10);
    }
    public static int[] arrayCreator(){
        int[] newArr = new int[(int)(Math.random() *10)+1];

        for (int i=0; i<newArr.length;i++){
            newArr[i] = (int) (Math.random()*10)+1;
        }
        return newArr;
    }
}
