package Exercise02_220319;

public class Exam0207 {

    static void makeTri(int a){

        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("$");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){

        int num = 3;
        makeTri(num);

        num = 4;
        makeTri(num);

        num = 5;
        makeTri(num);
    }
}
