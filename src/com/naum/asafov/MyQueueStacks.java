package com.naum.asafov;

public class MyQueueStacks<T>{

    private Stack<T>[] stacks;
    private int numberOfStacks;

    public MyQueueStacks(int numberOfStacks){
        this.numberOfStacks = numberOfStacks;
        stacks = new Stack[numberOfStacks];
        for (int i = 0; i < numberOfStacks; i++){
            stacks[i] = new SimpleStack<>();
        }
    }

    public void add(int stack,T item) {
        stacks[stack].push(item);
    }

    public T remove(int stack) {
        T item = stacks[stack].getLast();
        return item;
    }

    public T peek() {//TO-DO
        return null;
    }

    public boolean isEmpty(int stack) {
        return stacks[stack].isEmpty();
    }
    public int size(int stack){
        return stacks[stack].getSize();
    }
}

