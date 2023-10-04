/*

java에서는 보통 main(String[] args)라고 한다.
이때, args배열은 명령줄에 전달된 인자를 저장하므로, java Login minjiki2 1111이라고 실행하면
args[0] : "minjiki2", args[1] = "1111"이 될 것이다.

C언어와 java는 "main 메서드 자체가" 명령줄 인자를 다르게 다룬다.
예를 들어, c언어에서 ./a.out minjiki2 1111 을 실행할 때, argc는 전달된 명령줄 인자의 개수 3,
argv[0] : "./a.out", argv[1] : "minjiki2", argv[2] : "1111"이 저장된다.

그러나, java의 "main메서드는" 매개변수로 문자열 배열을 사용한다.
만일, java Login minjiki2 1111을 커맨드라인으로 넘기면,
argv.length = "2"이 되고, argv[0] = "minjiki2", argv[1] = "1111"이 된다

*/

package org.opentutorials.javatutorials.Condition;

public class java_main_args
{
    public static void main(String[] args)
    {
        // test, 커맨드라인 : java java_test minjiki2 1111
        // 결과, args.length : 2, args[0] : minjiki2, args[1] : 1111
        // System.out.println("args.length : " + args.length);
        // System.out.println("args[0] : " + args[0]);
        // System.out.println("args[1] : " + args[1]);

      
        
            if (args[0].equals("minjiki2"))
            {
                if (args[1].equals("0101"))
                    System.out.println("id and password is correct");
                else
                    System.out.println("id is correct, password is not correct");
            }
            else
                System.out.println("id isn't correct, failed ...");
    

        return ;
    }
}