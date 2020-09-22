package com.company.lab2_queue;


import java.util.ArrayList;


public class Queue {
    ArrayList<Integer> queue = new ArrayList<>();
    int max_size;

    public Queue(){
        this.max_size = -1;
    }

    public Queue(int size){
        this.max_size = size;
    }

    public boolean isEmpty(){
        return queue.size() == 0;
    }

    public boolean isFull(){
        return max_size > -1 && queue.size() == max_size;
    }

    public void push(Integer num){
        if (isFull()){
            System.out.println("queue maximum size reached");
        }
        else {
            queue.add(num);
        }
    }

    public Integer pop() {
        Integer mem;
        if (!isEmpty()) {
            mem = queue.get(0);
            queue.remove(0);
            return mem;
        }
        return null;
    }

    public void print(){
        for (Integer i : queue)
            System.out.print(i + " ");
        System.out.print("\n");

    }
}
