package com.github.vkvish19.designpatterns.behavioural.iterator_pattern.solution;

/**
 *  This is how we can have an Iterator interface
 *   and then create its implementations in the required classes.
 *   But in this example, we will use the already existing Iterator<E> interface
 *   of the java.util package.
 */
public interface Iterator<T>
{
    boolean hasNext();
    T next();
}
