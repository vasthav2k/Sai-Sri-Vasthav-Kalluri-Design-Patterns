package com.epam.DesignPatterns.AdapterPatterns;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;
	
	
	public MediaAdapter(String audioType) {
		// TODO Auto-generated method stub
				if(audioType.equals("mp4"))
					advancedMediaPlayer= new MP4Player();
				else
					advancedMediaPlayer= new MKVPlayer();
	}


	@Override
	public void play(String audioType, String fileName)
	{
		// TODO Auto-generated method stub
				if(audioType.equals("mp4"))
					advancedMediaPlayer.playMP4(fileName);
				else
					advancedMediaPlayer.playMKV(fileName);
		
	}

}
