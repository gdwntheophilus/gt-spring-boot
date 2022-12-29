package gt.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public void learnArrayList(){
        List names = new ArrayList(List.of(new String[]{
                "a", "b"
        }));
        names.remove(1);
        names.add("c");
        names.addAll(List.of(new String[]{
                "d","e","f"
        }));
        System.out.println(names.contains("e"));

        System.out.println(names);
    }
}
