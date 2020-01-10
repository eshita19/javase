# JAVASE
## Mbeans:
   https://www.journaldev.com/1352/what-is-jmx-mbean-jconsole-tutorial
   https://github.com/eshita19/javase/tree/master/src/main/java/com/esh/j2se/jmx
## Annotations: 
   https://www.geeksforgeeks.org/annotations-in-java/
   https://github.com/eshita19/javase/tree/master/src/main/java/com/esh/j2se/annotations
   
## Generics:
   - https://github.com/eshita19/javase/tree/master/src/main/java/com/esh/j2se/generics
   - It is possible to create a single class, which will work with different types - Using Generics.
   -  Generics work only with reference types.
   - Generics gives **compile time safety**. Generic type differ based on their type arguments. We could also work on different types by creating variable of type Object. But it would result in runtime exceptions if two objects of Generic type are not compatible (Integer and String).
   ```
   iob = strob
   int val = (Integer) iob.getVal(); // run-time error
   ```
   - ### Bounded types: 
     - Limit the types that can be passed to a type parameter. 
     - For example a bounded type to support only numeral value : ```class Stats<T extends Number>```
     -  ### Wildcard arguments:
        - Two generic types of different types cannot be compared, but in order to compare two generic types, it can be passed as wildcard argument. ```public boolean sameVal(MyType<?> myType2)```
        - Bounded wildcard ```<? extends A> <? Super A>```
     
   - ### Generic methods:  
       - We can create generic method and constructors.
          ```public static <T> int getVal(T val)```
          
   - ### Generic Interfaces:
     - ```interface MinMax<T extends Comparable<T>>```
     - ```class MyClass<T extends Comparable<T>> implements MinMax<T>```
     -``` Class MyClass implements MinMax<Integer>```
     
  - ### Raw types and legacy Code:
    - ```class MyGeneric<T>{ T val}```
    - We can Create object without type safety, Here it will be treated as object.
    - ```
       MyGeneric intVal = new MyGeneric(10);
       MyGeneric strVal = new MyGeneric("eshita");
       intVal = (Integer) strVal.getVal() // run time error
      ```
 ## Collections
   - ### Collection Interfaces:
     - **Collection**:
       - Add elements:
          - boolean add(E obj) - Return true if elements are added.
          - boolean addAll(Collection<? extends E> c) - Returns true if the collection changed, else false.
       - Remove elements:
         - boolean remove(Object obj) - Removes one instance of obj from the invoking collection. Returns true if the element was removed. Otherwise, returns false.
         - boolean removeAll(Collection<?> c) - Returns true if collection changed, else false.
         - default boolean removeIf( Predicate<? super E> predicate) - Removes from the invoking collection those elements that satisfy the condition specified by predicate. 
         - boolean retainAll(Collection<?> c) - Removes all elements from the invoking collection except those in c.
         - void clear() - remove all elements.
       - Contains: 
         - boolean contains(Object obj) - Returns true if obj is an element of the invoking collection.
         - boolean containsAll(Collection<?> c) - Returns true if the invoking collection contains all elements of c.
         - boolean isEmpty( ) - Returns true if the invoking collection is empty.
         - int size() - no Of elements in collection.
       - Conversion:
         - Object[] toArray() - Returns an array that contains all the elements stored in the invoking collection.
         - <T> T[ ] toArray(T array[ ]) - returns an array of elements that have the same type as the array specified as a parameter.
       - Iteration:
         - Iterator<E> iterator( )- Returns an iterator for the invoking collection.
         - default Stream<E> parallelStream( ) - Returns a stream that uses the invoking collection as its source for elements. 
         - default Spliterator<E> spliterator( ) 
         - default Stream<E> stream( )
   
     - **List**: Allows duplicate elements, provide indexing.
       - Add elements:
         - public void add(int index, E element): Add element at particular index.
         - boolean addAll(int index, Collection<? extends E> c) : Add all elements starting at the index.
         -  boolean add(E obj): Add elements at the end.
       - Get/Set element:
         - E get(int index): Get the element at the index.
         - set(int index, E element)
         - List<E> subList(int fromIndex, int toIndex): Gets a sublist of elements.
       - Find elements:
         -  int indexOf(Object o) - Returns the index of the first occurrence of the specified element in this list, or -1.
         -  int lastIndexOf(Object o) - Returns the last index of the specified element.
     - **Set**: Set doesnot define its own methods but add() method will return false if we try to add duplicate element.
       - **Sorted Set**: Set sorted in ascending order. 
         - Comparator<? super E> comparator( ) : Returns the custom comparator used otherwise null.
         - E first( ): Returns first element of set.
         - E last( ): Returns last element of set.
         - SortedSet<E> headSet(E end): Returns elements from first element till the end element passed in argument.
         - SortedSet<E> tailSet(E start): Returns elements from start element in argument till the end.
         - SortedSet<E> subSet(E start, E end): Returns a SortedSet that includes those elements between start and end–1
      - **Navigable Set** : The NavigableSet interface extends SortedSet 
        - E ceiling(E obj): Searches the set for the smallest element e such that e >= obj.
        - E floor(E obj): Searches the set for the largest element e such that e <= obj.
        - E higher(E obj): Searches the set for the largest element e such that e > obj.
        - E lower(E obj): Searches the set for the largest element e such that e < obj.
        -  NavigableSet<E> headSet(E upperBound, boolean incl): Returns a NavigableSet that includes all elements from the invoking set that are less than upperBound. If incl is true, then an element equal to upperBound is included.
        - NavigableSet<E> tailSet(E lowerBound, boolean incl): Returns a NavigableSet that includes all elements from the invoking set that are greater than lowerBound. If incl is true, then an element equal to lowerBound is included.
        - NavigableSet<E> subSet(E lowerBound,boolean lowIncl, E upperBound, boolean highIncl)
        - E pollFirst( ): Returns the first element, removing the element in the process.
        - E pollLast( ): Returns the last element, removing the element in the process.  
   - **Queue** - First in first out structure.
     - E element( ) - Returns the element at the head of the queue. The element is not removed. It throws NoSuchElementException if the queue is empty.
     - E peek( ) - Returns the element at the head of the queue. It returns null if the queue is empty. The element is not removed.
     - E remove( ) -  Removes the element at the head of the queue, returning the element in the process. It throws NoSuchElementException if the queue is empty.
     - E poll( ) - Returns the element at the head of the queue, removing the element in the process. It returns null if the queue is empty.
     - boolean offer(E obj) - Attempts to add obj to the queue. Returns true if obj was added and false otherwise.
   - **Deque** - Extends Queue - doubly ended queue.
     - E peekFirst()/ E peekLast - Returns the element at the head/tail of the deque. It returns null if the deque is empty. The object is not removed.
     - E pollFirst( )/E pollLast( ) - Returns the element at the head/tail of the deque, removing the element in the process. It returns null if the deque is empty.
     -  E pop( )/ E removeFirst( ) - Returns the element at the head of the deque, removing it in the process. It throws NoSuchElementException if the deque is empty.
     - void push(E obj)/ void addFirst(E obj) - Adds obj to the head of the deque. Throws an IllegalStateException if a capacity-restricted deque is out of space.
     - boolean offerFirst(E obj)/boolean offerLast(E obj) - Attempts to add obj to the head/tail of queue. Returns true if obj was added and false otherwise.
   
   - **ArrayList** : 
     - The ArrayList class extends AbstractList and implements the List interface.
     - ArrayList supports dynamic arrays that can grow as needed.
     - ArrayList constructors:
       ```
       ArrayList( )
       ArrayList(Collection<? extends E> c) 
       ArrayList(int capacity)
       ```
     - void ensureCapacity(int cap) : Manually increase size of arraylist to capacity.
     - void trimToSize(): Trim array to number of elements it is holding.
     
   - **LinkedList**:
     - The LinkedList class extends AbstractSequentialList and implements the List, Deque, and Queue interfaces. 
     - Constructors:
       ```
       LinkedList( )
       LinkedList(Collection<? extends E> c)
       ```
   - **HashSet** :  
     - HashSet extends AbstractSet and implements the Set interface.
     - Creates a collection that uses a hash table for storage.
     - For large sets the time complexity remains constant for operations like add( ), contains( ), remove( ), and size( ).
     - Constructors:
       ```
       HashSet( )
       HashSet(Collection<? extends E> c) HashSet(int capacity)
       HashSet(int capacity, float fillRatio)
       ```
     - Does not guarantee the order of its elements   
     - Backed by HashMap.
     
  - **LinkedHashSet**:
    - LinkedHashSet extends HashSet and and adds no members of its own.
    - LinkedHashSet maintains a linked list of the entries in the set, in the order in which they were inserted. This allows insertion-order iteration over the set.
  
  - **TreeSet**:
    - TreeSet extends AbstractSet and implements the NavigableSet interface.
    - It creates a collection that uses a tree for storage.
    - Objects are stored in sorted, ascending order.
    - Access and retrieval times are quite fast, which makes TreeSet an excellent choice when storing large amounts of sorted information that must be found quickly.
    
  - **ArrayDeque**:
    - The ArrayDeque class extends AbstractCollection and implements the Deque interface.
It adds no methods of its own. 
    - Creates a dynamic array.
    - Constructors:
      ```
      ArrayDeque( )
      ArrayDeque(int size)
      ArrayDeque(Collection<? extends E> c)
      ```
  - **EnumSet**
    - EnumSet extends AbstractSet and implements Set. 
    - It is specifically for use with elements of an enum type.
    
     
       
  
 
    
  
         
         
         
       
    
   
         
         
   

   
   

 
