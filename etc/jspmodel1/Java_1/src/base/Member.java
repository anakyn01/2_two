package base;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}
	//return 사용하고 바로 중지, return false; 교유 기능을 중지(취소)
	
	@Override //어노테이션 클래스를 자신의 입맛에 맞게 재정의
	public boolean equals(Object obj) { 
		//Object의 equals 메소드 재정의
		if(obj instanceof Member target) {
			//obj가 Member타입인지 검사하고 타입변환후 target 변수에 대입
			if(id.equals(target.id)) {//id문자열이 같은지 비교
				return true;
			}
			
		}
		return false;
	}
}
