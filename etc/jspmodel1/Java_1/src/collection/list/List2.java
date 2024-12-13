package collection.list;
/*
list 컬렉션은 객체를 인덱스로 관리하기 때문에
객체를 저장하면 인덱스가 부여되고 인덱스로 객체를 검색 삭제할수 있는 기능을 제공한다
list 컬렉션에는 ArrayList, Vector, LinkedList등이 있는데
list 컬렉션에서 공통적으로 사용가능한 List인터페이스 메소드는 아래와 같다

객체추가 :
boolean add(E e) => 주어진 객체를 맨 끝에 추가
void add(int index, E element) => 주어진 인덱스에 객체를 추가
set(int index, E elemment) => 주어진 인덱스의 객체를 새로운 객체로 바꿈

객체검색 :
boolean contains(Object to) => 주어진 객체가 저장 되어 있는지 여부
E get(int index) => 주어진 인덱스에 저장된 객체를 리턴
isEmpty() => 컬렉션이 이어 있는지 조사
int size() => 저장되어 있는 전체 객체수를 리턴

객체삭제 :
void clear() => 저장된 모든 객체를 삭제
E remove(int index) => 주어진 인덱스에 저장된 객체를 삭제
boolean remove(Object o) => 주어진 객체를 삭제

ArrayList는 List컬렉션에서 가장 많이 사용하는 컬렉션이다
ArrayList에 객체를 추가하면 내부 배열에 객체가 저장된다
일반 배열과의 차이점은 제한없이 객체를 추가할수 있다

List컬렉션은 객체 자체를 저장하는것이 아니라 객체의 번지를 저장한다
또한 동일한 객체를 중복저장할수 있는데 이 경우에는 동일한 번지가 저장된다
null또한 저장이 가능하다

아래의 예시에서 컬렉션 생성의 3가지를 확인한다
*/
import java.util.*;


public class List2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//지정된 타입의 객체만 저장 . 안에 클래스도 들어갈수 있음
		ArrayList<String> list2 = new ArrayList<>();
		//타입을 바꾸지 않으면 뒤에 타입을 생략해도 됩니다
		ArrayList list3 = new ArrayList();
		//모든 타입의 객체를 저장
	}

}
