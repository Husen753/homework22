package com.company;

public class C extends A implements Printable{
    private String c;

    public C(String a,String c) {
        super(a);
        this.c=c;
    }

    @Override
    public void print() {
        System.out.println(c);
    }
}
