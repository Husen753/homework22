package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        createObject("B");
        createObject("C");
        createObject("D");
    }
        public static A createObject(String className){
            switch (className){
                case "B":
                    B b = new B("DFGFDDG", "Demble");
                    b.print();
                    return b;
                case "C":
                    C c = new C("AHAHAHA", "Alio");
                    c.print();
                    return c;
                case "D":
                    D d = new D("Uhh", "lalalala");
                    d.print();
                    return d;
                default:
                    return null;
            }
        }
    }

