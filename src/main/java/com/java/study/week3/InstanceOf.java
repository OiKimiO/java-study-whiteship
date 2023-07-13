package week3;

public class InstanceOf {
    public static void main(String[] args) {
        TempType2 tempType2 = new TempType2();
        TempType3 tempType3 = new TempType3();
        TempType4 tempType4 = new TempType4();

        System.out.println("tempType2 instanceof TempType1:" + (tempType2 instanceof TempType1));
        System.out.println("tempType2 instanceof TempType3:" + (tempType2 instanceof TempType3));
        System.out.println("tempType2 instanceof TempType4:" + (tempType2 instanceof TempType4));

        System.out.println("tempType2 instanceof TempType1:" + (tempType3 instanceof TempType1));
        System.out.println("tempType2 instanceof TempType3:" + (tempType3 instanceof TempType2));
        // System.out.println("tempType2 instanceof TempType4:" + (tempType3 instanceof TempType4)); error 발생: 확실히 호환되지 않음

        System.out.println("tempType2 instanceof TempType1:" + (tempType4 instanceof TempType1));
        System.out.println("tempType2 instanceof TempType3:" + (tempType4 instanceof TempType2));
        // System.out.println("tempType2 instanceof TempType4:" + (tempType4 instanceof TempType3)); error 발생: 확실히 호환되지 않음
    }

    interface TempType1{

    }

    static class TempType2 implements TempType1{

    }

    static class TempType3 extends TempType2{

    }

    static class TempType4 extends TempType2{

    }
}
