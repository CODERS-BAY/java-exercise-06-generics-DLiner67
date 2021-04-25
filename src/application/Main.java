package application;

import list.SortedLinkedList;
import list.SortedList;
import model.Animal;

public class Main {
    public static void main(String[] args) {
       /*
            test your implementation here
        */
        Animal x=new Animal("X",7);
        Animal hund=new Animal("R",7);
        Animal katze=new Animal("D",2);
        Animal b=new Animal("B",7);
        Animal kuh=new Animal("A",7);

        SortedLinkedList<Animal>list=new SortedLinkedList<Animal>();
        list.insert(x);
        list.insert(b);
        list.insert(hund);
        list.insert(katze);
        list.insert(kuh);

        list.printList();
    }
}

/*
QUESTIONS:
1. Change the ordering of the list:
Collections.sort
Collections.reverse
Implement Comparator as class and use "ascending"/"descending"
2. Can the inner node be static?
No. Only classes and instances can be static.
3. Rename a generic placeholder?
Possible, but doesn't make sense - "placeholder" is not a data type.
4. Benefits of <T> data structure
You don't need casts for type changes
5. Drawbacks w/use-case
a. Type erasure: instanceOf is not possible.
b. Generics doesn't work with primitive data types -> Arrays are not possible
 */