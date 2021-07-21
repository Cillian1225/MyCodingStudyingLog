package kh.spring.beans;

import kh.spring.interfaces.TV;

public class LgTV implements TV{

	private int Channel;
	private int Volume;
	private BritzSpeaker speaker;
	
	
	
	public LgTV() {}

	
	public LgTV(int channel, int volume, BritzSpeaker speaker) {
		super();
		Channel = channel;
		Volume = volume;
		this.speaker = speaker;
	}


	public int getChannel() {
		return Channel;
	}


	public void setChannel(int channel) {
		Channel = channel;
	}


	public int getVolume() {
		return Volume;
	}


	public void setVolume(int volume) {
		Volume = volume;
	}


	public BritzSpeaker getSpeaker() {
		return speaker;
	}


	public void setSpeaker(BritzSpeaker speaker) {
		this.speaker = speaker;
	}


	public void printVolume() {
	System.out.println("LgTV의  볼륨은: "+this.Volume);
	this.speaker.volume();
	}
	public void printChannel() {
		System.out.println("LgTV의 채널은: "+this.Channel);
	}

	
}
