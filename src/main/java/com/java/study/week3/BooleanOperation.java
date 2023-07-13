package week3;

public class BooleanOperation {

    public static void main(String[] args) {
        BooleanXY allTrue = new BooleanXY(true, true);
        BooleanXY trueFalse = new BooleanXY(true, false);
        BooleanXY falseTrue = new BooleanXY(false, true);
        BooleanXY allFalse = new BooleanXY(false, false);

        allTrue.xAndY();
        allTrue.xOrY();
        System.out.println();

        trueFalse.xAndY();
        trueFalse.xOrY();
        System.out.println();

        falseTrue.xAndY();
        falseTrue.xOrY();
        System.out.println();

        allFalse.xAndY();
        allFalse.xOrY();
    }

    static class BooleanXY{
        public boolean x;
        public boolean y;

        public BooleanXY(boolean x, boolean y){
            this.x = x;
            this.y = y;
        }

        public void xOrY(){
            System.out.printf("x: %b or y: %b = %b \n",x,y,x||y);
        }

        public void xAndY(){
            System.out.printf("x: %b and y: %b = %b \n",x,y,x&&y);
        }
    }
}
