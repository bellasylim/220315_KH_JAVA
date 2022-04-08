package java_review02_220408;

public class review0205 {

    public static void main(String[] args) {

        //배열 선언
        String[] nums = new String[11];
        //배열 요소 수에 비례해서 줄을 찍을 수 있도록 변수 설정
        int count = (nums.length / 2) + 1;
        //요소 번호 변수 초기화
        int defaultNum = 0;

        //for문 반복을 통해 0~11 값 정수로 캐스트해 배열 요소에 삽입
        for(int i = 0; i < nums.length; i++){
            nums[i] = String.valueOf(i);
        }

        //do-while문 활용해 배열 전체 값 프린트
        do {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
            }
            System.out.println();

            nums[defaultNum] = " ";
            nums[10 - defaultNum] = " ";

            defaultNum++;

            } while(!(defaultNum == count));
        }
    }
