package com.company;

public class D extends A implements Printable{
    private String d;

    public D(String a,String d) {
        super(a);
        this.d = d;
    }

    @Override
    public void print() {
        System.out.println(d);
    }
}
