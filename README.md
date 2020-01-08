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
   
   
   

   
   

 
