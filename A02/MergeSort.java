package A02;

public class MergeSort {
    //Comparable is used, assuming we can order the elements numerically.
    public static <T extends Comparable<T>> void sort(LinkedList<T> list) {
        if (list.size() <= 1) {
            return; //List is already sorted if 0 or 1 element.
        }

        LinkedList<T> backList = list.frontBackSplit();

        //Recursively divides the lists
        sort(list);
        sort(backList);

        //Merges the subdivided lists until we receive the sorted list.
        LinkedList<T> merged = merge(list, backList);
 
        list.head = merged.head;
        list.tail = merged.tail;
        list.size = merged.size;
    }

    //Merge the divided lists by 
    public static <T extends Comparable<T>> LinkedList<T> merge(LinkedList<T> list1, LinkedList<T> list2) {
        Node<T> dummy = new Node<>(null);
        Node<T> current = dummy;

        Node<T> l1 = list1.head;
        Node<T> l2 = list2.head;

        while (l1 != null && l2 != null) {
            if (l1.value.compareTo(l2.value) <= 0) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        current.next = (l1 != null) ? l1 : l2;

        // Find the new tail
        Node<T> newTail = current;
        while (newTail.next != null) {
            newTail = newTail.next;
        }

        LinkedList<T> mergedList = new LinkedList<>();
        mergedList.head = dummy.next;
        mergedList.tail = newTail;
        mergedList.size = list1.size() + list2.size();

        return mergedList;
    }
}