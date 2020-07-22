package com.epam.DesignPatterns.AdapterPatterns;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void playMKV(String fileName)
	{
		
	}

	@Override
	public void playMP4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing:"+fileName);

	}

}
