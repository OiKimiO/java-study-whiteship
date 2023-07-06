package week3;


public class AssignmentOperator {

    public static void main(String[] args) {
        // shallowCopy();
        // deepCopy();
        int a = 1;
        System.out.printf("a = 1 ,결과값: %d \n",a);
            a += 2;
        System.out.printf("a += 2 ,결과값: %d \n",a);
            a -= 2;
        System.out.printf("a -= 2 ,결과값: %d \n",a);
            a *= 3;
        System.out.printf("a *= 3 ,결과값: %d \n",a);
            a /= 3;
        System.out.printf("a /= 3 ,결과값: %d \n",a);
    }

    private static void deepCopy() {
        Position origin = new Position(2, 3);
        Position copy = Position.copyPosition(origin);
        copy.setX(4);
        copy.setY(6);

        System.out.println(origin);
        System.out.println(copy);
    }

    private static void shallowCopy() {
        Position origin = new Position(2, 3);
        Position copy = origin;

        System.out.println(origin);
        System.out.println(copy);
    }

    static class Position{
        private int x;
        private int y;

        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }

        public Position(){

        }

        public static Position copyPosition(Position origin){
            Position tempPosition = new Position();
            tempPosition.x = origin.x;
            tempPosition.y = origin.y;
            return tempPosition;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
