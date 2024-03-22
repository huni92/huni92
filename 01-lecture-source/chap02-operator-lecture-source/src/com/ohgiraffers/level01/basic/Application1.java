package com.ohgiraffers.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        /* 예제 문제를 기재해주세요 */

        /* Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		System.out.println() 의 결과를 예측하고 이유를 설명하시오.
		*/

        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        //System.out.println(y >= 5 || x < 0 && x > 2); //&& 연산자가 || 연산자보다 우선순위가 높기때문에 x < 0 && x > 2가 false로 먼저 값이 나오나 y >= 5 || false 인 상황에서 y >= 5 는 true 값이기에 정답은 true로 나온다.
        //System.out.println(y += 10 - x++); //y에 10을 더한 값을 다시 y에 대입해 y는 15, x++ 의 ++은 괄호안에 수식이 끝난 후 1을 더해주기 때문에 15-2 = 13이 나온다.
        //System.out.println(x+=2); // x값에 2를 더하고 다시 대입하여 4가 나온다.
        System.out.println( !('A' <= c && c <='Z') ); // 65값은
    }
}
