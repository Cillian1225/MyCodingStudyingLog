package kh.spring.factory;

import kh.spring.beans.LgTV;
import kh.spring.beans.SamsungTV;
import kh.spring.interfaces.TV;

public class BeanFactory {

//브랜드의 이름의 다를 때  new해서 각각의 브랜드에 따른 이름을 만들어준다.
	public static TV tvFactory(String brand) {

		if(brand.contentEquals("samsung")) {

			return new SamsungTV();

		}else if(brand.contentEquals("lg")) {

			return new LgTV();
			
		}else {
			return null;
		}
	}











}
