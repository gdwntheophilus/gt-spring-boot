package gt.learning;

import java.util.*;

public class SetLearning {
    public void setLearningHashSet(){
        Set set = new HashSet();

        set.add("b");
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("c");
        System.out.println(set);
        Iterator iterator = set.iterator();
        System.out.println(set);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void setLearningHashMap(){
        Set set = new TreeSet();
        set.add("b");
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("c");
        System.out.println(set);

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
