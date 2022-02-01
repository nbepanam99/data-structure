# data-structure.

## the Collection hierarchy in Java

```
               Iterable*                                  *Interface
                   ▲
                   │                                      ─────► Implements
              Collection*
                   ▲                                      -----► Extends
 ┌─────────────────┬──────────────┐
 │                 │              │
List*            Queue*           Set*                Map*
 ▲               ▲  ▲             ▲ ▲                 ▲ ▲
 !               │  !             | !                 ! |
 !               │  PriorityQueue │ !                 ! SortedMap*
 !               │                │ !-HashSet         !    ▲
 !               │                │ !                 !    !
 !               │                │ !                 !   TreeMap
 !--ArrayList    │                │ !                 !
 !               │                │ └-LinkedHashSet   !
 !               Deque*           │                   !
 !                ▲               │                   !
 !                !               │                   !─HashMap
 !                !               │                   !
 !--LinkedList----!               │                   !
 !                !               │                   !
 !                !               │                   └─HashTable
 !                !               │
 !                !               │
 !                !               │
 └─Vector        ArrayDeque      SortedSet*
    ▲                             ▲
    |                             !
   Stack                         TreeSet
```

### Description:
| Interface   | Methode                               | Comment                                                                                 |
|-------------|---------------------------------------|-----------------------------------------------------------------------------------------|
| Iterator    | public boolean hasNext()              | This method returns true if the iterator has more elements.                             |
|             | public object next()                  | It returns the element and moves the cursor pointer to the next element.                |
|             | public void remove()                  | This method removes the last elements returned by the iterator.                         |
|             |                                       |                                                                                         |
| List        | boolean add(Collection c)             | Appends the specified element to the end of a list.                                     |
|             | void add(int index, Object element)   | Inserts the specified element at the specified position.                                |
|             | void clear()                          | Removes all the elements from this list.                                                |
|             | Object clone()                        | Return a shallow copy of an ArrayList.                                                  |
|             | Object[] toArray()                    | Returns an array containing all the elements in the list.                               |
|             | void trimToSize()                     | Trims the capacity of this ArrayList instance to be the list’s current size.            |
| Linked List | boolean add( Object o)                |  It is used to append the specified element to the end of the vector.                   |
|             |  boolean contains(Object o)           |  Returns true if this list contains the specified element.                              |
|             |  void add (int index, Object element) |  Inserts the element at the specified element in the vector.                            |
|             |  void addFirst(Object o)              |  It is used to insert the given element at the beginning.                               |
|             |  void addLast(Object o)               |  It is used to append the given element to the end.                                     |
|             |  int size()                           |  It is used to return the number of elements in a list                                  |
|             |  boolean remove(Object o)             |  Removes the first occurrence of the specified element from this list.                  |
|             |  int indexOf(Object element)          | Returns the index of the first occurrence of the specified element in this list, or -1. |
|             |  int lastIndexOf(Object element)      | Returns the index of the last occurrence of the specified element in this list, or -1.  |
|             |                                       |                                                                                         |
|             |                                       |                                                                                         |
