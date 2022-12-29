package gt.learning;

import java.util.Arrays;
import java.util.List;

public class StringArray {
    public String[] learnStringArray(){
        String[] nameList = new String[] {
                "Godwin Theophilus"
        };
        System.out.println(Arrays.toString(nameList));
        return nameList;
    }
    public String[] learnStringArrayWithIndex() {
        String[] nameList = new String[5];
        nameList[0] = "Godwin Theophilus";
        System.out.println(Arrays.toString(nameList));
        return nameList;
    }

    public void ListOfStrings() {
        String[] names = new String[]{
                "a","b"
        };
        System.out.println(List.of(names));
    }
}
