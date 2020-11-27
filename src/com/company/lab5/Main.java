package com.company.lab5;

public class Main {
    public static void main(String[] args) {

        A a = new A("x0", "a0");
        B b = new B("x1","a1", "b1");
        C c = new C("x2","a2", "b2", "c2");
        D d = new D("x3","a3", "b3", "c3", "d3");
        E e = new E("x4","a4", "b4", "c4", "d4", "e4");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
