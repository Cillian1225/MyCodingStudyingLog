package kh.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kh.spring.interfaces.TV;


public class Main {

	public static void main(String[] args) {
		//이런식으로 인터페이스를 쓰면, 참조변수를 일일히 안바꿔도됨.
		
		//TV tv  =BeanFactory.tvFactory("samsung");//다형성을 써도 해결이 안된다.
		//자료형을 밝혀주는것이 발목을 잡는다. (new부분)s
		//그러면 new를 대체할 수 있는게 없을까? 최대한 안쓰는게 좋겠네.. 전략적으로
		//인터페이스->디자인패턴적용(팩토리 패턴)
		
		
		//LgTV tv =new LgTV();
		//tv.printVolume(); //인터페이스가 강요하는 메서드를 씀.
		
		
						  //코드의 변화가 크지않도록 조절해준다.

		ApplicationContext ctx = new GenericXmlApplicationContext("context.xml");
		//1.스프링컨테이너 인스턴스가 만들어지고 instancePool을 가진다.
		//DBCP랑 같은 구조이다. 만들어놓고 가져와쓰기
		TV tv = ctx.getBean(TV.class); //3.TV자료형을 인스턴스를 가져와라(getbean)
		// DL: Dependency Lookup;
		
		//스프링 컨테이너(instance pool(울타리) 가지고있음)를 만드는 코드이다.
		//하나의 인스턴스임 이름만 스프링임~
		//2.코드실행하면 스프링컨테이너 인스텐스가 생성되고, 
		//3.자신이 만들어지면서 지정된 파일에 있는 내용을 읽기시작
		//3.context.xml에 적혀있는 인스턴스도 같이 만들어진다.그안에 누가 누구랑 연결되어있는지 매칭 
	
		tv.printVolume();
		tv.printChannel();
		
	}

}
