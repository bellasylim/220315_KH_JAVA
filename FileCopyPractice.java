package Exercise09_220401;//명령행 인수를 실행하기 위해서는 package 안에 넣으면 복잡해진다고 해서 제일 상위 파일에 프로젝트 따로 생성

//입출력 관련 라이브러리 모두 호출
//19장 파일 입출력 FileInOutData1 예제 참고
import java.io.*;
import java.util.*;

public class FileCopyPractice {
    public static void main(String[] args) {

        //복사할 파일 내용의 String을 한 줄씩 저장하는 ArrayList 배열 선언
        ArrayList<String> copyList = new ArrayList<String>();

        try {
                //복사할 파일명 직접 입력할 수 있도록 Scanner 객체 input1 선언
                Scanner input1 = new Scanner(System.in);
                System.out.print("복사할 파일명을 정확히 입력하세요. ");
                //file1 데이터 파일 로드
                Scanner file1 = new Scanner(new File(input1.nextLine()));

                //모든 데이터를 배열로 가져오기
                while (file1.hasNextLine()) {
                    //배열에 데이터 저장
                    copyList.add(file1.nextLine());
                }
                //file1 스트림 닫기
                file1.close();
                System.out.println("파일 로드가 완료되었습니다.");

                //붙여넣기할 파일명 직접 입력할 수 있도록 Scanner 객체 input2 선언
                Scanner input2 = new Scanner(System.in);
                System.out.print("붙여넣기할 파일명을 정확히 입력하세요. ");
                //입력한 값 input2와 동일한 명칭으로 file2 파일 생성
                PrintWriter file2 = new PrintWriter(new BufferedWriter(new FileWriter(input2.nextLine())));

                //반복문 사용해 copyList 배열에 저장되어 있는 데이터 한줄씩 file2에 입력
                for (int i = 0; i < copyList.size(); i++) {
                    file2.println(copyList.get(i));
                }

                //file2 스트림 닫기
                file2.close();
                System.out.println("파일 복사가 완료되었습니다.");

        }catch(FileNotFoundException e){
            System.out.println("파일명의 지정이 부정확합니다." + e);
        }catch(IOException e){
            System.out.println("입출력 에러입니다." + e);
        }
    }
}