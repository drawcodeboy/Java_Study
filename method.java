public class method {
    public static void main(String args[]) {
        String a = "string sample";
        System.out.println(a); // 엔터가 들어가있음
        System.out.print(a + '\n');// 엔터가 들어가있지 않음
        System.out.printf("%s", a);// 대응하는 인자가 있어야 함

    }
}

/*
 * 윈도우 cmd 에서 자바 파일 실행 시킬 때
 * 
 * 1. 해당 파일이 있는 디렉토리로 이동 2. javac 파일명.java: 명령어를 통해 컴파일 3. java 파일명: 명령어를 통해 실행
 */

/*
 * vscode에서 실행 시킬 때
 * 
 * 1. 해당 파일에 run|debug 버튼을 클릭함 (정확한 이유는 못 밝혀 냈지만 하지 않으면 전의 파일이 실행 됨) 2. 터미널에서 실행
 * 확인
 */