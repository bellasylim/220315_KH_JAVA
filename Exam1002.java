package Exercise10_220405_LSY;

public class Exam1002 {
    public static void main(String[] args) {
        //센터 포워드 객체 생성
        SoccerPlayer fwd = new CenterForward("홍길동", 11);
        //자기 소개
        System.out.println(fwd);
        //공을 처리
        fwd.kickBall();
        fwd.catchBall();
        System.out.println();

        //골키퍼 객체 생성
        SoccerPlayer keeper = new GoalKeeper("이순신", 12);
        //자기소개
        System.out.println(keeper);
        //공을 처리
        keeper.kickBall();
        keeper.catchBall();
    }
}
//축구 선수 추상 클래스
abstract class SoccerPlayer{
    private String name;
    private int uniformNumber;

    public SoccerPlayer(String name, int uniformNumber){
        this.name = name;
        this.uniformNumber = uniformNumber;
    }

    public String getName(){
        return name;
    }

    public void kickBall(){
        System.out.println(name + "은 공을 찼습니다.");
    }

    public void catchBall(){
        System.out.println(name + "은 볼을 발로 받았습니다.");
    }

    abstract public String getPositionName();

    public String toString(){
        return getPositionName() + " " + name + " 번호 " + uniformNumber;
    }
}

//센터 포워드 클래스
class CenterForward extends SoccerPlayer{
    String POSITION_NAME = "센터 포워드";

    public CenterForward(String name, int uniformNumber){
        super(name, uniformNumber);
    }

    public String getPositionName(){
        return POSITION_NAME;
    }
}

//골키퍼 클래스
class GoalKeeper extends SoccerPlayer{
    String POSITION_NAME = "골키퍼";

    public GoalKeeper(String name, int uniformNumber){
        super(name, uniformNumber);
    }

    public String getPositionName(){
        return POSITION_NAME;
    }

    @Override
    public void catchBall(){
        System.out.println(getName() + "은 볼을 손으로 받았습니다.");
    }
}
