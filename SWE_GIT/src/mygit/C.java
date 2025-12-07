package mygit;

public class C {

	public static void main(String[] args) {
		// 메인 실행 클래스
		A student=new A();
		B score=new B();
		
		System.out.println("=== 성적 관리 프로그램 ===");
		System.out.println("학생 :"+student.name);
		System.out.println("점수: "+score.subjectScore);
		// Alice가 평균 관련 출력문 추가
		System.out.println("결과: 평균 점수 계산중");

	}

}
