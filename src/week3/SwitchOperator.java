package week3;

public class SwitchOperator {
    public static void main(String[] args) {
        java12이전_Switch();
    }

    private static void java12이전_Switch() {
        System.out.println(코드가길다());
        System.out.println(break를_놓친다());
    }

    private static int 코드가길다() {
        String 요청값 = "파란색";
        int temp = 0;

        switch(요청값){
            case "파란색":
                temp = 1;
                break;
        }

        return temp;
    }

    private static int break를_놓친다() {
        String 요청값 = "파란색";
        int temp = 0;

        switch(요청값){
            case "빨간색":
                temp = 2;
            case "파란색":
                temp = 1;
                break;
        }

        return temp;
    }
}
