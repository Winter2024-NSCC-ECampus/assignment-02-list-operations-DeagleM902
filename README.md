# PROG2400 DSA - Assignment 02
### List Operations - MergeSort on LinkedList
This java application is the implementation of the given requirements to sort a linked list using merge sort. The requirements are as follows:

  #Insertion : at the beginning, at the end, at the given location in the sorted list

  #Deletion: of first node, of last node, of given item index from sorted list

  #Given a list, split it into two sub lists — one for the front half, and one for the back half. If the number of elements is odd, the extra element should go in the front list. So FrontBackSplit() on the list {2, 3, 5, 7, 11} should yield the two lists {2, 3, 5} and {7, 11}.

  #Given two one-way-link lists A and B (sorted or unsorted). Sort them independently and then Merge as list.

The LinkedList class adds methods to insert at the given index, delete the first node, delete at the given index, and split the list in half with frontBackSplit().

MergeSort will subdivide the list recursively, then merge the subdivisions into a sorted list.

Main provides examples of a merge sort, as well as an example of sorting independently, then merging as a list.
