package A01;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    //Append(value) adds a new node containing value to the end of the list
    public void append(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    // prepend(value) adds a new node containing value to the start of the list
    public void prepend(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // size returns the total number of nodes in the list
    public int size(){
        return size;
    }

    // head returns the first node in the list
    public Node<T> head(){
        return head;
    }

    // tail returns the last node in the list
    public Node<T> tail(){
        return tail;
    }

    // at(index) returns the node at the given index
    // Return null if no valid answer, otherwise iterate through to find the desired element.
    public Node<T> at(int index){
        if (index < 0 || index >= size) return null;
        Node<T> current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current;
    }

    // pop removes the last element from the list
    public void pop(){
        if (size == 0) return;
        if (size == 1) {
            head = tail = null;
        } else {
            Node<T> current = head;
            while (current.next != tail) current = current.next;
            current.next = null;
            tail = current;
        }
        size--;
    }

    // contains?(value) returns true if the passed in value is in the list and otherwise returns false.
    public boolean contains(T value){
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(value)) return true;
            current = current.next;
        }
        return false;
    }

    // find(value) returns the index of the node containing value, or nil if not found.
    public Integer find(T value){
        int index = 0;
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(value)) return index;
            current = current.next;
            index++;
        }
        return null;
    }

    //Added to print list values
    public void printList() {
        Node<T> current = head;
        System.out.println("Current List: ");
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        } System.out.println();
    }
}
