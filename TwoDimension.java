package review06_220414;

import java.time.LocalDate;

public class TwoDimension{
    int x;
    int y;
    int count = 0;
    LocalDate now = LocalDate.now();
    int day = now.getDayOfMonth();

    public TwoDimension(){
        this.x = 0;
        this.y = 0;
        count++;
        System.out.println("(" + x + "," + y + ")");
    }

    public TwoDimension(int x){
        this.x = x;
        this.y = 0;
        count++;
        System.out.println(count + "(" + x + "," + y + ")");

        LocalDate now = LocalDate.now();
        int dayOfMonth = now.getDayOfMonth();

        if(count == dayOfMonth){
            System.out.println("당첨! 오늘 " + count + "의 좌표가 생성되었습니다.");
        }
    }

    public TwoDimension(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
        System.out.println(count + "(" + x + "," + y + ")");

        LocalDate now = LocalDate.now();
        int dayOfMonth = now.getDayOfMonth();

        if(count == dayOfMonth){
            System.out.println("당첨! 오늘 " + count + "의 좌표가 생성되었습니다.");
        }
    }

    if(count == day){
        System.out.println("당첨! 오늘 " + count + "의 좌표가 생성되었습니다.");
    }

}