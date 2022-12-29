package gt.learning;

import java.util.Arrays;

public class ArrayStreamValues {
    public void learnArrayStreamValues(){
        String[] names = new String[]{
                "Godwin",
                "Sudha",
                "A",
                "B",
                "C",
                "C"
        };
        Arrays.stream(names).forEach(data ->{
            System.out.println(data);
        });
        System.out.println(Arrays.stream(names).count());
        //remove duplicates
        System.out.println(Arrays.toString(Arrays.stream(names).distinct().toArray()));
    }
}
