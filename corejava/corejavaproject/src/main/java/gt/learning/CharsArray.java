package gt.learning;

import java.util.Arrays;
import java.util.Collections;

public class CharsArray {
    public char[] learnCharArray(){
        char[] chars = new char[]{
                '1','f','c','2'
        };
        System.out.println(Arrays.toString(chars));
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        return chars;
    }
}
