package Exercise06_220328;

public class Exam0604 {
    public static void main(String[] args){
        //귤의 가격을 표현하는 int형의 변수를 선언해주세요.
        //귤의 가격 변수에 130을 대입해주세요.
        int price;
        price = 1300;
        // 귤의 개수를 표현하는 int형의 변수를 선언해,
        // 초기값으로 6을 대입하십시오. (변수명은 맡깁니다)
        int num = 6;
        // 귤의 총가격을 표현하는 int형의 변수를 선언하고,
        // 초기값에 「귤 가격 변수의 값×귤 수 변수의 값」의 연산 결과
        //를 대입하십시오. (변수명은 맡깁니다)
        int sum = price * num;
        // 귤 가격 변수의 값을 출력합니다.
        // 귤 수 변수의 값을 출력합니다.
        // 귤 총 가격 변수의 값을 출력합니다
        System.out.println("귤 가격 : " + price + "원");
        System.out.println("귤 갯수 : " + num + "개");
        System.out.println("귤 총 가격 : " + sum + "원");
    }
}
