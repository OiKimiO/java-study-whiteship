package week4;

public class Selection {
    public static void main(String[] args) {
        // if문(true);
        // ifElse문(false);
        ifElseIfElse(false, true);
    }

    private static void ifElseIfElse(boolean 내일은_나의_시험일, boolean 내일은_친구의_시험일) {
        if(내일은_나의_시험일){
            System.out.println("집에 가서 공부해야죠!");
        }else if(내일은_친구의_시험일){
            System.out.println("친구랑 같이 공부해야죠!");
        }else{
            System.out.println("오랜만에 놀아볼까요!");
        }
    }

    private static void ifElse문(boolean 내일은_시험일) {
        if(내일은_시험일){
            System.out.println("집에 가서 공부해야죠!");
        }else{
            System.out.println("친구들이랑 놀 수도 있죠!");
        }
    }

    private static void if문(boolean 내일은_시험일) {
        if(내일은_시험일){
            System.out.println("집에 가서 공부해야죠!");
        }
    }

}
