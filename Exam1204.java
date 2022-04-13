package review05_220413;

public class Exam1204 {

    public static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
        for(int i = 0; i < z.length; i++){
            for(int j = 0; j < z[i].length; j++){
                z[i][j] = x[i][j] + y[i][j];
            }
        }

        System.out.println("행렬a");
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("행렬b");
        for(int i = 0; i < y.length; i++){
            for(int j = 0; j < y[i].length; j++){
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("행렬c");
        for(int i = 0; i < z.length; i++){
            for(int j = 0; j < z[i].length; j++){
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }

        if(x.length == y.length){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[][] arrA = {{1,2,3},{4,5,6}};
        int[][] arrB = {{6,3,4},{5,1,2}};
        int[][] arrC = new int[2][3];

        addMatrix(arrA, arrB, arrC);

    }
}
