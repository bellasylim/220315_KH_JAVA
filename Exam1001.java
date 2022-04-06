package Exercise10_220405_LSY;

public class Exam1001 {
    public static void main(String[] args) {
        // 3마리의 동물들을 나타내는 Animal 서열형 변수 animals 선언과
        // 배열 객체 생성
        Animal[] animals = new Animal[3];

        // 동물들 배열 변수의 각 요소에 차례로 개, 고양이, 새 객체 생성 및 할당
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Bird();

        // for 루프를 사용하여 동물들의 배열 변수를 순서대로 살펴 보겠습니다.
        // 각 동물의 노래하는 sing 메서드 호출
        for (Animal animal : animals) {
            animal.sing();
        }
    }
}

//동물 클래스
abstract class Animal{
    public abstract void sing();
}
// 여기에 Dog 클래스를 만듭니다.
class Dog extends Animal{
    @Override
    public void sing(){
        System.out.println("멍 멍");
    }
}
// 여기에 Cat 클래스를 만듭니다.
class Cat extends Animal{
    @Override
    public void sing(){
        System.out.println("야옹 야옹");    }
}
// 여기에 Bird 클래스를 만듭니다.
class Bird extends Animal{
    @Override
    public void sing(){
        System.out.println("뻐꾹 뻐꾹");    }
}
