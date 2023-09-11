package com.java.study.week6;

public class DynamicMethodDispatch {
}

class ParnetA{
    private BB bb;

    ParnetA(BB bb){
        this.bb = bb;
    }

    void print(){
        bb.print();
    }
}

interface BB{
    void print();
}

class ChildB implements BB{
    public void print(){
        System.out.println("B");
    }
}

class ChildB1 implements BB{
    public void print(){
        System.out.println("B1");
    }
}
