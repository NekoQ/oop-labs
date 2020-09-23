package com.company.lab2_queue;

public class Main {
    public static void main(String[] args) {
        Queue queue1 = new Queue(5);
        Queue queue2 = new Queue();

        queue1.push(1);
        queue1.push(2);
        queue1.push(3);
        queue2.push(9);
        queue2.push(8);
        queue2.push(7);

        System.out.println(queue1.pop());
        System.out.println(queue2.pop());

        queue1.print();
        queue2.print();
    }
}
