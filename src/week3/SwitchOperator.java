package week3;

public class SwitchOperator {
    public static void main(String[] args) {
        java12이전_Switch();
        java12_Switch();
        java13_Switch();
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

    private static void java12_Switch(){
        System.out.println(java12_람다리턴("파란색"));
    }

    private static int java12_람다리턴(String 요청값) {
        return switch(요청값){
            case "파란색" -> 1;
            default -> 2;
        };
    }

    private static void java13_Switch(){
        System.out.println(java13_람다리턴_중괄호_리턴("파란색"));
    }

    private static int java13_람다리턴_중괄호_리턴(String 요청값){
        return switch(요청값){
            case "파란색" -> {
                int aa = 123;
                yield aa + 1; // java13 기능
            }
            default -> 2;
        };
    }

}
