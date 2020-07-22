package com.epam.DesignPatterns.AdapterPatterns;

public class Player implements MediaPlayer
{
	
	MediaAdapter mediaAdapter;
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		mediaAdapter = new MediaAdapter(audioType);
		mediaAdapter.play(audioType, fileName);
		
	}
	
}
