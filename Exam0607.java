package Exercise06_220328;

public class Exam0607 {
    public static void main(String[] args){
        //산의 단수를 나타내는 변수
        int level = 5;
        //for문 시작
        for(int i = 1; i <= level; i++){
            String white = "□ ";
            String black = "■ ";
            int j = 5;
                System.out.println(white.repeat(j - i) + black.repeat(i + (i - 1)));
            }
        }
    }
