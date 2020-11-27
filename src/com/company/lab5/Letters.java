package com.company.lab5;

class A {

    protected String a;
    protected X x = new X("xxx");

    A(String x, String a){
        this.x = new X(x);
        this.a = a;
    }
    @Override
    public String toString() {
        return "x = " + x + ", " + "a = " + a + ", ";
    }
}

class B extends A {

    B(String x, String a, String b){
        super(x, a);
        this.b = b;

    }
    protected String b;

    @Override
    public String toString() {
        return super.toString() +
                "b = " + b + ", ";
    }
}

class C extends B {

    C(String x, String a, String b, String c){
        super(x, a, b);
        this.c = c;

    }
    protected String c;

    @Override
    public String toString() {
        return super.toString() +
                "c = " + c + ", ";
    }
}

class D extends C {
    D(String x, String a, String b, String c, String d){
        super(x, a, b, c);
        this.d = d;
    }
    protected String d;
    protected X x = new X("dx");

    @Override
    public String toString() {
        return super.toString() +
                "d = " + d + ", ";
    }
}

class E extends D {
    E(String x, String a, String b, String c, String d, String e){
        super(x, a, b, c, d);
        this.e = e;
    }
    protected String e;
    private X x = new X("ex");

    @Override
    public String toString() {
        return super.toString() +
                "e = " + e + ", ";
    }
}

class X {

    private String x;

    X(String x){
        this.x = x;
    }

    @Override
    public String toString() {
        return x;
    }
}


