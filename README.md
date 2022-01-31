# data-structure.

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
 !─ArrayList     │                │ !                 !
 !               │                │ └-LinkedHashSet   !
 !               Deque*           │                   !
 !                ▲               │                   !
 !                !               │                   !─HashMap
 !                !               │                   !
 !─LinkedList-----!               │                   !
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
