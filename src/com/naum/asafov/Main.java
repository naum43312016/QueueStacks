package com.naum.asafov;

public class Main {
    public static void main(String[] args) {
        MyQueueStacks<Integer> queueStacks = new MyQueueStacks<>(2);
        queueStacks.add(0,1);
        queueStacks.add(0,2);
        queueStacks.add(0,3);
        System.out.println(queueStacks.remove(0));
        System.out.println(queueStacks.remove(0));
        System.out.println(queueStacks.remove(0));
    }
}
