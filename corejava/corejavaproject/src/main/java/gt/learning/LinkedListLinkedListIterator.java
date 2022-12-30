package gt.learning;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListLinkedListIterator {
    public void linkedListLinkedListIterator(){
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Person("Godwin","Theophilus"));
        linkedList.add(new Person("Sudha","Mani"));
        System.out.println(linkedList.toString());
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }

    class Person {
        String firstName;
        String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
}
