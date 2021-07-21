package kh.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kh.spring.interfaces.TV;


public class Main {

	public static void main(String[] args) {
		//�̷������� �������̽��� ����, ���������� ������ �ȹٲ㵵��.
		
		//TV tv  =BeanFactory.tvFactory("samsung");//�������� �ᵵ �ذ��� �ȵȴ�.
		//�ڷ����� �����ִ°��� �߸��� ��´�. (new�κ�)s
		//�׷��� new�� ��ü�� �� �ִ°� ������? �ִ��� �Ⱦ��°� ���ڳ�.. ����������
		//�������̽�->��������������(���丮 ����)
		
		
		//LgTV tv =new LgTV();
		//tv.printVolume(); //�������̽��� �����ϴ� �޼��带 ��.
		
		
						  //�ڵ��� ��ȭ�� ũ���ʵ��� �������ش�.

		ApplicationContext ctx = new GenericXmlApplicationContext("context.xml");
		//1.�����������̳� �ν��Ͻ��� ��������� instancePool�� ������.
		//DBCP�� ���� �����̴�. �������� �����;���
		TV tv = ctx.getBean(TV.class); //3.TV�ڷ����� �ν��Ͻ��� �����Ͷ�(getbean)
		// DL: Dependency Lookup;
		
		//������ �����̳�(instance pool(��Ÿ��) ����������)�� ����� �ڵ��̴�.
		//�ϳ��� �ν��Ͻ��� �̸��� ��������~
		//2.�ڵ�����ϸ� �����������̳� �ν��ٽ��� �����ǰ�, 
		//3.�ڽ��� ��������鼭 ������ ���Ͽ� �ִ� ������ �б����
		//3.context.xml�� �����ִ� �ν��Ͻ��� ���� ���������.�׾ȿ� ���� ������ ����Ǿ��ִ��� ��Ī 
	
		tv.printVolume();
		tv.printChannel();
		
	}

}
