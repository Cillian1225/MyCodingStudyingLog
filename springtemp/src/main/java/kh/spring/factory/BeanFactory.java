package kh.spring.factory;

import kh.spring.beans.LgTV;
import kh.spring.beans.SamsungTV;
import kh.spring.interfaces.TV;

public class BeanFactory {

//�귣���� �̸��� �ٸ� ��  new�ؼ� ������ �귣�忡 ���� �̸��� ������ش�.
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
