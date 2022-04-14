package review06_220414;

public class Exam1301_220414 {
    public static void main(String[] args) {
        Human human1 = new Human("홍길동", 170, 60);
        Human human2 = new Human("추성훈", 177, 84);

        human1.setBirthday("1975년 03월 12일 (수)");
        human2.setBirthday("1987년 10월 07일 (수)");

        System.out.println(human1.toString());
        System.out.println(human2.toString());

    }
}

class Human{
    private String name;
    private int height;
    private int weight;
    private String birthday;

    public Human(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;

        System.out.println("이름 : " + name);
        System.out.println("신장 : " + height + "cm");
        System.out.println("체중 : " + weight + "kg");
    }

    public String getBirthday(){
        return birthday;
    }

    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

    public String toString(){
        return name + " : " + height + "cm " + weight + "kg " + getBirthday() + "출생";
    }
}