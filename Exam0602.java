package Exercise06_220328;

public class Exam0602 {
    public static void main(String[] args){
        //Magazine클래스 객체 생성
        Magazine magazine = new Magazine("GQ", 10000, "정우성");
        //잡지내용 소개 메소드 호출
        magazine.show();
    }
}

//Book클래스
class Book {
    //제목
    private String title;
    //가격
    private int price;
    //생성자
    public Book(String title, int price){
        this.title = title;
        this.price = price;
    }

    //제목 얻기
    public String getTitle(){
        return title;
    }
    //가격 얻기
    public int getPrice(){
        return price;
    }
}

class Magazine extends Book {
    String coverPersonName;

    public Magazine(String title, int price, String coverPersonName){
        super(title, price); //super 상속 검색함
        this.coverPersonName = coverPersonName;
    }
    public void show(){
        System.out.println(getTitle() + " 절찬 판매 중!");
        System.out.println("정가 : " + getPrice() + "원");
        System.out.println("이번 표지 : " + coverPersonName);
    }
}