package gt.learning;

import java.util.Arrays;

public class IntArrays {
    public int[] learnIntArrays(){
        int[] numbers = new int[]{
                1,2,3,4,5,7
        };
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }
    public int[] learnIntArraysWithIndex() {
        int[] numbers = new int[10];
        numbers[0] = 1;
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }
}
