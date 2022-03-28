package Exercise06_220328;

public class Exam0603 {
    public static void main(String[] args){
        //일반 시계 객체 생성
        Clock c1 = new Clock(10, 15, 30);
        //일반 시계정보 표시
        c1.showData();
        System.out.println();
        //알람시계 객체 생성
        AlarmClock c2 = new AlarmClock(15, 45, 20, 6, 30);
        //알람 시계 정보 표시
        c2.showData();
    }
}
//시계 클래스
class Clock{
    //시분초
    private int hour;
    private int minute;
    private int second;
    //생성자
    public Clock(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //정보 표시 방법
    public void showData(){
        System.out.println("현재 시간 : " + hour + "시 " + minute + "분 " + second + "초");
    }
}

class AlarmClock extends Clock{
    //시분 인스턴드 필드
    int alarmHour;
    int alarmMinute;
    //생성자
    public AlarmClock(int hour, int minute, int second, int alarmHour, int alarmMinute) {
        super(hour, minute, second); // 슈퍼클래스 생성자 호출
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
    }
    public void showData(){
        super.showData(); //부모클래스 메소드 호출 검색
        System.out.println("알람 설정 시간 : " + this.alarmHour + "시 " + this.alarmMinute + "분");
    }
}