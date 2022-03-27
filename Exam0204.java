package Exercise02_220319;

import java.util.Scanner;

public class Exam0204 {

    public static void main(String[] args) {

        // 새로운 10자리 배열 선언
        int[] arr = new int[10];

        // 정수 10개 값 입력해 배열 요소에 넣음
        Scanner input = new Scanner(System.in);
        System.out.println("정수 10개를 입력하세요. ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        /*
        솔직히 여기에서 for 문 중첩을 왜 쓰는지 모르겠다...
        여기에서는 원래 내가 이해했던 for 문 중첩처럼 구구단 형식 때문에 사용한 게 아니라
        그냥 k의 범위값을 arr.length로 한정할 수 있어서 새로운 변수를 선언하듯 사용한 것 같음
        예를 들면 원래 내 생각은 int k = j+1; 이라고 선언해서 돌려도 똑같은 결과가 나와야 할 것 같은데
        그러면 k가 arr.length 범위를 넘어버리니까;
        이거 아니었다. 직접 하나하나 숫자 대입해서 해봤더니 이제야 이해 감... 하 진짜
        */
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j] > arr[k]) {
                    int cha = arr[j];
                    arr[j] = arr[k];
                    arr[k] = cha;
                }
                // 이해한 게 맞는지 확인. 중복된 for 문 안에서 배열이 재배열되는 것 프린트.
                for(int h = 0; h < arr.length; h++){
                    System.out.print(arr[h] + " ");
                    if(h == arr.length - 1){
                        System.out.println();
                    }
                }
            }
        }
        //오름차순으로 재배열한 배열 요소값 출력
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
