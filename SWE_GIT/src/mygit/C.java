package mygit;

public class C {

	public static void main(String[] args) {
		// 메인 실행 클래스
		A student=new A();
		B score=new B();
		
		System.out.println("=== 성적 관리 프로그램 ===");
		System.out.println("학생 :"+student.name);
		System.out.println("점수: "+score.subjectScore);
		// Master 브랜치에서 총점 계산 출력문으로 수정 (Alice의 '평균' 출력문과 충돌)
		System.out.println("결과: 총점 합계 계산중...");

	}

}
