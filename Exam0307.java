//시도01
package Exercise04_220322;

public class Exam0405 {

   static void guguDan(int num){

       for(int i = 1; i <= 9; i++){
           int result = num * i;
           System.out.println(num + " * " + i + " = " + result);
       }
   }

   public static void main(String[] args){

       for(int i = 1; i <= 9; i++){
           guguDan(i);
       }
   }
}

// 선생님 풀이
// package Exercise04_220322;

// public class Exam0405{

//     static void gugudanCoulumn(int num) {
//         for(int i = 1; i <= 9; i++)
//             System.out.printf("%2d ", num * i); // int 값으로 받겠다.

//         System.out.println();
//     }

//     public static void main(String[] args){
//         for(int i = 1; i <= 9; i++)
//             gugudanCoulumn(i);
//     }
// }

