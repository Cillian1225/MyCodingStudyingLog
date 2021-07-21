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
	
	//아래 우리가 만든것들은 추상메서드를 만든게 됨.
	public void printVolume() {
		
		System.out.println("삼성 TV의 볼륨: " + this.Volume);
	}
	
	
	public void printChannel() {
		
		System.out.println("삼성 TV의 채널: " + this.Channel);
	}
	
	
	
}
