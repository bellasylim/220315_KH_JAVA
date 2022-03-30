package Exercise07_220329;

import java.util.Random;

public class Exam0703 {

    public static void main(String[] args){
        Random random = new Random();
        int num = random.nextInt(3);
        if(num == 0){
            System.out.println("컴퓨터가 낸 것 : 가위");
        }else if(num == 1){
            System.out.println("컴퓨터가 낸 것 : 보");
        }else if(num == 2){
            System.out.println("컴퓨터가 낸 것 : 바위");
        }
    }
}
