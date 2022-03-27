package Exercise02_220319;

public class Exam0208 {

    static int mulTable(int num){
        int result = 1;

        for(int i = 1; i <= 9; i++){
            result = num * i;
            System.out.println(num + " * " + i + " = " + result);
            }
     return result;
    }

    public static void main(String[] args){

        int num = 5;
        mulTable(num);
    }
}
