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

        //length
        System.out.println(names.length);
        //count
        System.out.println(Arrays.stream(names).count());
        //remove duplicates
        System.out.println(Arrays.toString(Arrays.stream(names).distinct().toArray()));
        //sorting
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


    }
}
