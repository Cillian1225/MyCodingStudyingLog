package kh.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Person {


	private int id;
	private String name;
	
	@Autowired
	private Contact contact; //Peron�� ����Ʈ�� �־��� �� �ִ�. 
	//Person �ν��Ͻ��� ������� Autowired �� �߰��ϰ�  Contactâ���� ã�Ƽ� �������ش�.
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
