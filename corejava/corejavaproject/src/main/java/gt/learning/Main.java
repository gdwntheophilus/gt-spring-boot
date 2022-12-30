package gt.learning;

public class Main {
    public static void main(String[] args) {
//        String process = "StringArray";
//        String process = "StringArrayWithIndex";
//        String process = "IntArray";
//        String process = "IntArrayWithIndex";
//        String process = "ArrayStreamValues";
//        String process = "CharsArray";
//        String process = "ArrayListLearning";
//        String process = "StackLearning";
//        String process = "QueueLearning";
//        String process = "LinkedListLinkedListIterator";
//        String process = "SetLearning";
        String process = "MapLearning";
        StringArray stringArray = new StringArray();
        IntArrays intArrays = new IntArrays();
        ArrayStreamValues arrayStreamValues = new ArrayStreamValues();
        CharsArray charsArray = new CharsArray();
        ArrayListLearning arrayListLearning = new ArrayListLearning();
        StackLearning stackLearning = new StackLearning();
        QueueLearning queueLearning = new QueueLearning();
        LinkedListLinkedListIterator linkedListLinkedListIterator = new LinkedListLinkedListIterator();
        SetLearning setLearning = new SetLearning();
        MapLearning mapLearning = new MapLearning();
        switch (process) {
            case "StringArray":
                stringArray.learnStringArray();
                stringArray.ListOfStrings();
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
                break;
            case "CharsArray":
                charsArray.learnCharArray();
                break;
            case "ArrayListLearning":
                arrayListLearning.learnArrayList();
                break;
            case "StackLearning":
                stackLearning.learnStack();
                break;
            case "QueueLearning":
                queueLearning.learnQueue();
                break;
            case "LinkedListLinkedListIterator":
                linkedListLinkedListIterator.linkedListLinkedListIterator();
                break;
            case "SetLearning":
                setLearning.setLearningHashSet();
                setLearning.setLearningHashMap();
                break;
            case "MapLearning":
                mapLearning.learnHashMap();
                break;

        }
    }
}