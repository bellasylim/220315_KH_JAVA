package Exercise05_220325;

class Pet {
    private String type;
    private String name;
    private byte age;
    private boolean gender;

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

        public void setGender(boolean gender) {
            this.gender = gender;
    }

    public void getIntroduction() {
        if(gender == true) {
            System.out.println(this.type + " " + this.name + "는 암컷이고 " + this.age + "살입니다.");
        }else{
            System.out.println(this.type + " " + this.name + "는 수컷이고 " + this.age + "살입니다.");
        }
    }
}

    public class Exam0502 {
        public static void main(String[] args) {

            //첫 번째 애완동물 객체 생성
            Pet pet1 = new Pet();

            //첫 번째 애완동물 데이터를 설정
            pet1.setType("개");
            pet1.setName("준이");
            pet1.setAge((byte) 5);
            pet1.setGender(false);

            //두 번째 애완동물 객체 생성
            Pet pet2 = new Pet();

            //두 번째 애완동물 데이터를 설정
            pet2.setType("고양이");
            pet2.setName("야옹이");
            pet2.setAge((byte) 2);
            pet2.setGender(true);

            //검색하고 표시
            pet1.getIntroduction();
            pet2.getIntroduction();
        }
    }
