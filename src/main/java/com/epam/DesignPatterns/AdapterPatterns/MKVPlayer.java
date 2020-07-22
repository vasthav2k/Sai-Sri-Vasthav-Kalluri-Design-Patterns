package com.epam.DesignPatterns.AdapterPatterns;

public class MKVPlayer implements AdvancedMediaPlayer {

	@Override
	public void playMKV(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing:"+fileName);
	}

	@Override
	public void playMP4(String fileName) {
		// TODO Auto-generated method stub

	}

}
