package com.company;

public class B extends A implements Printable{
    private String b;

    public B(String a,String b) {
        super(a);
        this.b=b;
    }

    @Override
    public void print() {
        System.out.println(b);

    }
}
