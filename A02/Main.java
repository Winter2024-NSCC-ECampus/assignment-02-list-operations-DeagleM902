package A01;
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
        LinkedList<Integer> list = new LinkedList<>();

        list.append(3);
        list.append(52);
        list.append(9);
        list.printList();

        //Prepend
        list.prepend(5);
        list.printList();

        //Check size
        System.out.println("List size: " + list.size());

        //Show Head and Tail values
        System.out.println("Head value: " + list.head().value);
        System.out.println("Tail value: " + list.tail().value);

        //Retrieve an element at #
        System.out.println("Element at index 2: " + list.at(2).value);

        //Check if the list contains a value
        System.out.println("List contains 52? " + list.contains(52));
        System.out.println("List contains 42? " + list.contains(42));

        //Find values (not found = null)
        System.out.println("Location of 52: " + list.find(52));
        System.out.println("Location of 42: " + list.find(42));

        //Pop element
        list.pop();
        list.printList();

        LinkedList<String> stringList = new LinkedList<>();

        stringList.append("test1");
        stringList.append("values");
        stringList.append("added");

        stringList.printList();
    }
}
