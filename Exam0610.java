package Exercise06_220328;

public class Exam0610 {
    public static void main(String[] args) {
        int[] points = {
                69, 40, 88, 68, 13, 62, 45, 43, 28, 69,
                54, 77, 81, 34, 41, 78, 59, 21, 45, 64,
                55, 18, 63, 80, 64, 26, 52, 44, 61, 50,
                44, 82, 56, 74, 67, 98, 58, 84, 77, 70,
                60, 77, 64, 89, 59, 74, 21, 66, 85, 68,
                90, 48, 64, 80, 63, 47, 70, 79, 51, 66,
                23, 84, 57, 57, 76, 60, 100, 66, 79, 61,
                47, 66, 76, 45, 90, 69, 72, 51, 86, 64,
                57, 51, 42, 60, 71, 69, 7, 62, 77, 61,
                43, 50, 68, 30, 78, 58, 40, 62, 70, 22
        };
        // 평균 점수
        double sum = 0.0;
        int score1 = 0;
        int score10 = 0;
        int score20 = 0;
        int score30 = 0;
        int score40 = 0;
        int score50 = 0;
        int score60 = 0;
        int score70 = 0;
        int score80 = 0;
        int score90 = 0;
        String star = "*";

        for (int i = 0; i < points.length; i++) {
            sum += points[i];
        }
        System.out.println("평균 점수: " + (sum / points.length));

        //히스토그램
        System.out.println("히스토그램");

        for (int i = 0; i < points.length; i++) {
             if(points[i] <= 10){
                score1++;
            }else if(10 < points[i] && points[i] <= 20){
                 score10++;
             }else if(20 < points[i] && points[i] <= 30){
                 score20++;
             }else if(30 < points[i] && points[i] <= 40){
                 score30++;
             }else if(40 < points[i] && points[i] <= 50){
                 score40++;
             }else if(50 < points[i] && points[i] <= 60){
                 score50++;
             }else if(60 < points[i] && points[i] <= 70){
                 score60++;
             }else if(70 < points[i] && points[i] <= 80){
                 score70++;
             }else if(80 < points[i] && points[i] <= 90){
                 score80++;
             }else if(90 < points[i] && points[i] <= 100){
                 score90++;
             }
        }

        System.out.println("0점대 " + star.repeat(score1));
        System.out.println("10점대 " + star.repeat(score10));
        System.out.println("20점대 " + star.repeat(score20));
        System.out.println("30점대 " + star.repeat(score30));
        System.out.println("40점대 " + star.repeat(score40));
        System.out.println("50점대 " + star.repeat(score50));
        System.out.println("60점대 " + star.repeat(score60));
        System.out.println("70점대 " + star.repeat(score70));
        System.out.println("80점대 " + star.repeat(score80));
        System.out.println("90점대 " + star.repeat(score90));

    }
}
