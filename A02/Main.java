package A02;
// append(value) adds a new node containing value to the end of the list
// prepend(value) adds a new node containing value to the start of the list
// size returns the total number of nodes in the list
// head returns the first node in the list
// tail returns the last node in the list
// at(index) returns the node at the given index
// pop removes the last element from the list
// contains?(value) returns true if the passed in value is in the list and otherwise returns false.
// find(value) returns the index of the node containing value, or nil if not found.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> unsortedList = new LinkedList<>();
        unsortedList.append(5);
        unsortedList.append(1);
        unsortedList.append(9);
        unsortedList.append(3);
        unsortedList.append(2);
        unsortedList.append(6);
        unsortedList.append(7);
        unsortedList.append(4);
        unsortedList.append(8);
        System.out.println("Before sorting:");
        unsortedList.printList();

        MergeSort.sort(unsortedList);
        System.out.println("After sorting:");
        unsortedList.printList();

        LinkedList<Integer> listA = new LinkedList<>();
        LinkedList<Integer> listB = new LinkedList<>();

        listA.append(2);
        listA.append(5);
        listA.append(7);
        listA.append(1);

        listB.append(4);
        listB.append(6);
        listB.append(3);

        listA.printList();
        MergeSort.sort(listA);
        listA.printList();


        listB.printList();
        MergeSort.sort(listB);
        listB.printList();

        MergeSort.merge(listA, listB);

        listA.printList();
    }
}
