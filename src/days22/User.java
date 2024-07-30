package days22;

import java.io.Serializable;

public class User implements Serializable{ //직렬화될 수 있는 클래스로 만들어주기

	String name;
	
	//객체를 직렬화할 때 password는 포함x ?
	transient String password; //transient 붙이기
	int age;
	
	public User() {
		this("Unknown","1234",0);
	}
	public User(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age= age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
}
