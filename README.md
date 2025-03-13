# PROG2400 DSA - Assignment 01
### Custom Data Structure (LinkedList)
This java application is the implementation of the given requirements to create a data structure. The requirements are as follows:

  #append(value) adds a new node containing value to the end of the list

  #prepend(value) adds a new node containing value to the start of the list

  #size returns the total number of nodes in the list

  #head returns the first node in the list

  #tail returns the last node in the list

  #at(index) returns the node at the given index

  #pop removes the last element from the list

  #contains?(value) returns true if the passed in value is in the list and otherwise returns false.

  #find(value) returns the index of the node containing value, or nil if not found.

These methods can all be found in the LinkedList class, while the Main class can be run to demonstrate the usage of these methods. A printList() method is also included,
to print the values of the elements added to the list. This LinkedList is composed of Nodes, a value (any type) and another Node<T> (the next node in the list). By following
from the Head to the next value, and the next, and so on, the list can be followed until the last element, the Tail (where the next Node is null).
