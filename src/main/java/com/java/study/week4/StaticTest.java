package com.java.study.week4;

public class StaticTest {

    public static void main(String[] args){

        outerClass test = new outerClass();
        System.out.println("outerClass ::: " + test.getData());
        test.setData(3);
        System.out.println("outerClass ::: " + test.getData());

        outerClass test2 = new outerClass();
        System.out.println("outerClass ::: " + test2.getData());
        test2.setData(4);
        System.out.println("outerClass ::: " + test2.getData());

        innerClass innerClass = new innerClass();
        System.out.println("inner class ::: " + innerClass.data);

        innerClass.data = 3;
        innerClass innerClass2 = new innerClass();
        System.out.println("inner class ::: " + innerClass2.data);

        outerClass outerClass1 = new outerClass(1, new outerClass2());
        outerClass outerClass2 = new outerClass(1, new outerClass3());

        // >>>>
        outerClass1 = new outerClass(1, new outerClass2());

        outerClass1.changeOuterClass(new outerClass3()); // changeOuterClass라는 메시지를 통해서 기존의 outerClass를 재사용했음 > 합성

    }

    static class innerClass{
        private int data = 2;
    }

}

class outerClass{
    private int data = 2;
    private abstracClass abstracClass;

    public outerClass(int data, abstracClass abstracClass) {
        this.data = data;
        this.abstracClass = abstracClass;
    }

    public outerClass() {
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data){
        Integer integer = new Integer(1);
        this.data = data;
    }

    public void changeOuterClass(abstracClass abstracClass){
        this.abstracClass = abstracClass;
    }
}

abstract class abstracClass{

}

class outerClass2 extends abstracClass{
    public outerClass2() {
    }

    public void test(){
        System.out.println("테스트");
    }
}

class outerClass3 extends abstracClass{

}