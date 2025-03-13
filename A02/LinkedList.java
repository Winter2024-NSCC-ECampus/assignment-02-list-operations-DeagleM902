package A02;

public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;
    public int size;

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

    //Insert value at given index
    public void insertAt(int index, T value){
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds.");
            return;
        }
        if (index == 0 ){
            prepend(value); //Use prepend if applicable
        }
        if (index == size){
            append(value); //Use append if applicable
        }
        Node<T> newNode = new Node<>(value);
        Node <T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
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

    // removes the first element from the list
    public void deleteFirst(){
        if (head == null) return;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
    }

    public void deleteAt(int index){
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds.");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        if (index == size - 1) {
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

    //Splits the list into two segments (halves) by stepping through with "slow" and "fast" pointers
    public LinkedList<T> frontBackSplit() {
        LinkedList<T> backList = new LinkedList<>();
        if (head == null) {
            return backList;
        }
        if (head.next == null) {
            return backList;
        }

        Node<T> slow = head;
        Node<T> fast = head.next;

        //Step through until "fast" reaches the end of the list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        backList.head = slow.next;
        backList.tail = tail;
        backList.size = size - (size + 1) / 2;

        tail = slow;
        tail.next = null;
        size = (size + 1) / 2;

        return backList;
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
