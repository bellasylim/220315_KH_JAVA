//시도01
package Exercise04_220322;

import java.util.Scanner;

public class Exam0404 {

   public static void main(String[] args) {

       // 정수 10개 값 가지는 배열 선언
       int arr[] = new int[10];
       //배열 요소수 총합을 위한 변수 sum 0으로 초기화
       int sum = 0;

       System.out.println("양수인 정수 10개를 입력하세요. ");

       // 키보드 입력 10번 반복해서 배열 10개 값 입력
       for (int i = 0; i < arr.length; i++) {
           Scanner input = new Scanner(System.in);
           arr[i] = input.nextInt();

           // 배열 요소수 총합
           sum += arr[i];
//            System.out.println(sum); //총합값 맞는지 확인

           //총합이 100 초과하면 배열 요소 출력
           if (sum > 100) {
               for (int j = 0; j <= i; j++) {
                   System.out.print(arr[j] + "\t");
               }

               //if문 조건 맞으면 상위 for문 탈출
               break;

           //10열 10개 모두 입력되면 배열 요소 출력
           } else if (i == arr.length - 1) {
               for (int j = 0; j <= i; j++) {
                   System.out.print(arr[j] + "\t");
               }
           }
       }
   }
}

// //선생님 풀이
// package Exercise04_220322;

// import java.util.Scanner;

// public class Exam0404 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int values[] = new int[10];
//         int cnt, sum;

//         for(cnt = 0, sum = 0; cnt < 10 && sum <= 100; cnt++){
//             values[cnt] = sc.nextInt();
//             sum += values[cnt];
//         }
//         for(int i = 0; i < cnt ; i++){
//             System.out.println("\n" + values[i]);
//         }
//     }
// }
