package mysql.ref;

import lombok.Data;

@Data //생성자,얻기,세팅,해시코드,equals(),toString() 자동생성
public class User {
	private String userId;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userEmail; //and 시마이
}
