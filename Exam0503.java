package Exercise05_220325;

class Person{
    String name;
    int age;

    public void setData(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void introduce(){
        System.out.println("내 이름은 " + this.name + ", 나이는 " + this.age + "세입니다.");
    }

    public void compare(String name1, String name2, int age1, int age2){
        if(age1 < age2){
            System.out.println("나는 " + name1 + "이고 " + name2 + "님보다 " + (age2 - age1) + "살 연상입니다." );
        }else if(age1 > age2){
            System.out.println("나는 " + name1 + "이고 " + name2 + "님보다 " + (age1 - age2) + "살 연하입니다." );
        }else{
            System.out.println("나는 " + name1 + "이고 " + name2 + "님과 같은 나이입니다.");
        }
    }

}

public class Exam0503 {

    public static void main(String[] args){

        Person person1 = new Person();
        person1.setData("홍길동", 30);
        person1.introduce();

        Person person2 = new Person();
        person2.setData("이순신", 31);
        person2.introduce();

        Person person3 = new Person();
        person3.setData("이산", 33);
        person3.introduce();

        Person compare1 = new Person();
        compare1.compare("강산", "이순신", 31, 31);

        Person compare2 = new Person();
        compare1.compare("이이", "이산", 29, 31);

        Person compare3 = new Person();
        compare1.compare("유홍", "이순신", 33, 31);
    }
}
