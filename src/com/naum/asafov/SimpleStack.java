package com.naum.asafov;

import java.util.EmptyStackException;

public class SimpleStack<T> implements Stack<T> {

    private int size;
    private StackNode<T> top;
    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;
        public StackNode(T data){
            this.data = data;
        }
    }

    @Override
    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    @Override
    public void push(T data) {
        StackNode<T> node = new StackNode<>(data);
        node.next = top;
        top = node;
        size++;
    }

    @Override
    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int getSize() {
        return size;
    }


    @Override
    public T getLast() {
        return peekLast(top);
    }

    private T peekLast(StackNode<T> node) {
        if (node.next == null){
            T item = (T) node.data;
            size--;
            return  item;
        }else {
            StackNode<T> next = node.next;
            if (node.next.next == null){
                node.next = null;
            }
            return peekLast(next);
        }
    }
}