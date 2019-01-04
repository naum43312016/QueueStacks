package com.naum.asafov;

public interface Stack<T> {
    T pop();
    void push(T data);
    T peek();
    boolean isEmpty();
    int getSize();
    T getLast();
}

