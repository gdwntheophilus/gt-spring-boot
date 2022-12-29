package gt.learning;

public class Main {
    public static void main(String[] args) {
//        String process = "StringArray";
//        String process = "StringArrayWithIndex";
//        String process = "IntArray";
//        String process = "IntArrayWithIndex";
        String process = "ArrayStreamValues";
        StringArray stringArray = new StringArray();
        IntArrays intArrays = new IntArrays();
        ArrayStreamValues arrayStreamValues = new ArrayStreamValues();
        switch (process) {
            case "StringArray":
                stringArray.learnStringArray();
                break;
            case "StringArrayWithIndex":
                stringArray.learnStringArrayWithIndex();
                break;
            case "IntArray":
                intArrays.learnIntArrays();
                break;
            case "IntArrayWithIndex":
                intArrays.learnIntArraysWithIndex();
                break;
            case "ArrayStreamValues":
                arrayStreamValues.learnArrayStreamValues();
        }
    }
}