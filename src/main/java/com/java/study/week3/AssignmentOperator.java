package week3;


public class AssignmentOperator {

    public static void main(String[] args) {
        // shallowCopy();
        // deepCopy();
        // 대입연산자();
    }

    private static void 대입연산자() {
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
        a *= 3;
        a %= 3;
        System.out.println("a %= 3 ,결과값: " + a);
        a += 3;
        a &= 5;
        /* 3: 011, 5: 101
         *   011
         * & 101
         *   001
        * */
        System.out.println(a);
        a = 3;
        a |= 5;
        /* 3: 011, 5: 101
         *   011
         * | 101
         *   111
         * */
        System.out.printf("a |= 3 ,결과값: %d \n", a);
        a ^= 3;
        /* 7: 111, 3: 011
         *     111
         * XOR 011
         *     100
         */
        System.out.printf("a ^= 3 ,결과값: %d \n", a);
        a <<= 3;
        /* a = 4
         * a = 100
         * <<= 3번: 100000
         * */
        System.out.printf("a <<= 3 ,결과값: %d \n", a);
        /* a = 32
         * a = 100000
         * >>= 3번: 100
         * */
        a >>= 3;
        System.out.printf("a <<= 3 ,결과값: %d \n", a);
        /* a = 4
         * a = 100
         * a >>>= 3
         * a = 100000
         * */
        a = -32;
        a >>>= 3;
        /* a = -32
         * a = 11111111 11111111 11111111 00100000
         * a = 00011111 11111111 11111111 11100100
         * a = 536,870,908
         * */
        System.out.printf("a >>>= 3 ,결과값: %d \n", a);
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
