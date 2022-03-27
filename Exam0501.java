//시도01
package Exercise05_220325;

class Employee{
    private int number;
    private String name;

    public void setData(int number, String name){
        this.number = number;
        this.name = name;
    }

    public int getId(){
        return this.number;
    }

    public String getName(){
        return this.name;
    }
}

public class Exam0501 {
    public static void main(String[] args){
        //Employee 클래스 객체 만들기
        Employee employee = new Employee();

        //Employee 객체에 직원번호와 직원명을 설정함
        employee.setData(1234, "홍길동");

        //Employee 객체 직원번호 출력
        System.out.println("직원번호: " + employee.getId());
        //Employee 객체 직원명 출력
        System.out.println("직원명: " + employee.getName());
    }
}
