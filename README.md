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

| Interface   | Methode                               | Comment                                                                                        |
|-------------|---------------------------------------|------------------------------------------------------------------------------------------------|
| Iterator    | public boolean hasNext()              | This method returns true if the iterator has more elements.                                    |
|             | public object next()                  | It returns the element and moves the cursor pointer to the next element.                       |
|             | public void remove()                  | This method removes the last elements returned by the iterator.                                |
|             |                                       |                                                                                                |
| List        | boolean add(Collection c)             | Appends the specified element to the end of a list.                                            |
|             | void add(int index, Object element)   | Inserts the specified element at the specified position.                                       |
|             | void clear()                          | Removes all the elements from this list.                                                       |
|             | Object clone()                        | Return a shallow copy of an ArrayList.                                                         |
|             | Object[] toArray()                    | Returns an array containing all the elements in the list.                                      |
|             | void trimToSize()                     | Trims the capacity of this ArrayList instance to be the list’s current size.                   |
| Linked List | boolean add( Object o)                |  It is used to append the specified element to the end of the vector.                          |
|             |  boolean contains(Object o)           |  Returns true if this list contains the specified element.                                     |
|             |  void add (int index, Object element) |  Inserts the element at the specified element in the vector.                                   |
|             |  void addFirst(Object o)              |  It is used to insert the given element at the beginning.                                      |
|             |  void addLast(Object o)               |  It is used to append the given element to the end.                                            |
|             |  int size()                           |  It is used to return the number of elements in a list                                         |
|             |  boolean remove(Object o)             |  Removes the first occurrence of the specified element from this list.                         |
|             |  int indexOf(Object element)          | Returns the index of the first occurrence of the specified element in this list, or -1.        |
|             |  int lastIndexOf(Object element)      | Returns the index of the last occurrence of the specified element in this list, or -1.         |
| Queue       | boolean add(object)                   |  Inserts the specified element into the queue and returns true if it is a success.             |
|             |  boolean offer(object)                |  Inserts the specified element into this queue.                                                |
|             |  Object remove()                      |  Retrieves and removes the head of the queue.                                                  |
|             |  Object poll()                        |  Retrieves and removes the head of the queue, or returns null if the queue is empty.           |
|             |  Object element()                     |  Retrieves, but does not remove the head of the queue.                                         |
|             |  Object peek()                        |  Retrieves, but does not remove the head of this queue, or returns null if the queue is empty. |
| HashSet     | boolean add(Object o)                 |  Adds the specified element to this set if it is not already present.                          |
|             |  boolean contains(Object o)           |  Returns true if the set contains the specified element.                                       |
|             |  void clear()                         |  Removes all the elements from the set.                                                        |
|             |  boolean isEmpty()                    |  Returns true if the set contains no elements.                                                 |
|             |  boolean remove(Object o)             |  Remove the specified element from the set.                                                    |
|             |  Object clone()                       |  Returns a shallow copy of the HashSet instance: the elements themselves are not cloned.       |
|             |  Iterator iterator()                  |  Returns an iterator over the elements in this set.                                            |
|             |  int size()                           |  Return the number of elements in the set.                                                     |
| TreeSet     |  boolean addAll(Collection c)         |  Add all the elements in the specified collection to this set.                                 |
|             |  boolean contains(Object o)           |  Returns true if the set contains the specified element.                                       |
|             |  boolean isEmpty()                    |  Returns true if this set contains no elements.                                                |
|             |  boolean remove(Object o)             |  Remove the specified element from the set.                                                    |
|             |  void add(Object o)                   |  Add the specified element to the set.                                                         |
|             |  void clear()                         |  Removes all the elements from the set.                                                        |
|             |  Object clone()                       |  Return a shallow copy of this TreeSet instance.                                               |
|             |  Object first()                       |  Return the first element currently in the sorted set.                                         |
|             |  Object last()                        |  Return the last element currently in the sorted set.                                          |
|             |  int size()                           |  Return the number of elements in the set.                                                     |



# Clean Code
src: https://manifesto.softwarecraftsmanship.org/
