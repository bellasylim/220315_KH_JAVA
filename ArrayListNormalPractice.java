package Exercise09_220401;

import java.util.ArrayList;

public class ArrayListNormalPractice {
    public static void main(String[] args) {
        //디지털 카메라 객체 선언 및 생성
        DigitalCamera myCamera = new DigitalCamera();

        //디지털 카메라로 촬영
        myCamera.takePicture("새끼 고양이");
        myCamera.takePicture("런치" );
        myCamera.takePicture("카푸치노" );
        myCamera.takePicture("아기" );
        myCamera.takePicture("투샷" );
        System.out.println();

        //촬영 이미지 수 확인
        System.out.println("현재 촬영 매수: " + myCamera.getPictureCount());
        System.out.println();

        //이미지 보기
        myCamera.showPictures();
        System.out.println();

        //이미지 파일 지우기
        myCamera.clearMemory();
        System.out.println();

        //촬영 이미지 수 재확인
        System.out.println("현재 촬영 매수: " + myCamera.getPictureCount());
    }
}

//여기에 픽쳐 클래스를 만듭니다.
class Picture{
    private String target;

    //피사체를 인수에 받는 생성자 정의
    public Picture(String target){
        this.target = target;
    }

    //객체 설명을 문자열로 반환하는 toString메서드
    public void toString(String subject){
        System.out.println(subject + "의 화상");
    }
}

//여기에 디지털 카메라 클래스를 만듭니다.
class DigitalCamera{

    //촬영한 이미지를 관리하는 ArrayList유형 인스턴스 필드 메모리 정의
    ArrayList<String> arrMemory = new ArrayList<String>();

    //생성자로 메모리 인스턴스 필드 객체 생성
    public DigitalCamera(){
        this.arrMemory = new ArrayList<String>();
    }

    //이미지 촬영 방법 takePicture메서드
    public void takePicture(String subject){
        arrMemory.add(subject);
        System.out.println(subject + "를 촬영했습니다.");
    }

    //이미지 목록 표시 방법 showPictures메서드
    public void showPictures(){
        System.out.println("★☆ 화상 일람 ☆★」");
        for(int i = 0; i < arrMemory.size(); i++){
            System.out.println(arrMemory.get(i));
        }
    }

    //저장된 이미지 수 검색 방법 getPictureCount메서드
    public int getPictureCount(){
        return arrMemory.size();
    }

    //이미지 전체 지우기 메서드 clearMemory
    public void clearMemory(){
        arrMemory.clear();
        System.out.println("모든 이미지를 지웠습니다.");
    }
}