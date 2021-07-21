package kh.spring.beans;

import kh.spring.interfaces.TV;

public class SamsungTV implements TV {
	private int Channel;
	private int Volume;
	
	public SamsungTV() {}
	public SamsungTV(int channel, int volume) {
		super();
		this.Channel = channel;
		this.Volume = volume;
	}
	public int getChannel() {
		return Channel;
	}
	public void setChannel(int channel) {
		this.Channel = channel;
	}
	public int getVolume() {
		return Volume;
	}
	public void setVolume(int volume) {
		this.Volume = volume;
	} 
	
	//�Ʒ� �츮�� ����͵��� �߻�޼��带 ����� ��.
	public void printVolume() {
		
		System.out.println("�Ｚ TV�� ����: " + this.Volume);
	}
	
	
	public void printChannel() {
		
		System.out.println("�Ｚ TV�� ä��: " + this.Channel);
	}
	
	
	
}
