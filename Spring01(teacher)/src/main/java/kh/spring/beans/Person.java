package kh.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Person {


	private int id;
	private String name;
	
	@Autowired
	private Contact contact; //Peron의 컨텍트에 넣어줄 수 있다. 
	//Person 인스턴스를 만들고나서 Autowired 를 발건하고  Contact창에서 찾아서 연결해준다.
	public Person() {}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
