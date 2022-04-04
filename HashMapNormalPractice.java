package Exercise09_220401;

import java.util.*;

public class HashMapNormalPractice {
    public static void main(String[] args) {
        //금고 인스턴스 만들기
        StrongBox guard = new StrongBox();

        //비밀 단어 변수 선언
        String secret = null;

        try {
            //첫번째 보물 저장
            secret = "sgf01";
            guard.store(secret, new Treasure("다이어링"));
            // 두 번째 보물을 저장
            secret = "zkq02";
            guard.store(secret, new Treasure("진주 목걸이"));
            // 세 번째 보물을 저장
            secret = "xrt03";
            guard.store(secret, new Treasure("금 팔찌"));
            // 네 번째 보물을 저장 (비밀 단어 중복)
            secret = "xrt03";
            guard.store(secret, new Treasure("백금 귀걸이"));
        } catch (DuplicateSecretException e) {
            System.out.println("비밀 단어 " + secret + "은 이미 사용.");
        }
        System.out.println();
        try {
            // 첫 번째 보물 획득
            secret = "sgf01";
            Treasure treasure1 = guard.getTreasure(secret);
            System.out.println(treasure1 + "을 받았습니다!");
            // 두 번째 보물 획득
            secret = "zkq02";
            Treasure treasure2 = guard.getTreasure(secret);
            System.out.println(treasure2 + "을 받았습니다!");
            // 세 번째 보물을 얻는다 (비밀의 말이 부정)
            secret = "xrr03";
            Treasure treasure3 = guard.getTreasure(secret);
            System.out.println(treasure3 + "을 받았습니다!");
        } catch (IllegalSecretException e) {
            System.out.println("비밀 단어 " + secret + "은 부정");
        }
    }
}
// 여기에 보물 수업을 만드세요.
class Treasure{
    private String type;

    public Treasure(String type) {
        this.type = type;
    }

    public String toString(){
        return type;
    }
}
// 여기에 비밀 단어 부정 예외 클래스를 만듭니다.
class IllegalSecretException extends Exception{}

// 여기에 비밀 단어 중복 예외 클래스를 만듭니다.
class DuplicateSecretException extends Exception{}

// 여기에 금고 클래스를 만듭니다.
class StrongBox{
    HashMap<String,Treasure> treasure = new HashMap<>();

    public StrongBox(){
        this.treasure = new HashMap<String,Treasure>();
    }

    public void store(String secret, Treasure object) throws DuplicateSecretException{
        if(!treasure.containsKey(secret)){
            treasure.put(secret, object);
            System.out.println(object + "를 금고에 저장했습니다.");
        }else{
            throw new DuplicateSecretException();
        }
    }

    public Treasure getTreasure(String secret) throws IllegalSecretException{
        Treasure object = treasure.get(secret);
        if(!(object == null)){
            return object;
        }else{
            throw new IllegalSecretException();
        }
    }
}
