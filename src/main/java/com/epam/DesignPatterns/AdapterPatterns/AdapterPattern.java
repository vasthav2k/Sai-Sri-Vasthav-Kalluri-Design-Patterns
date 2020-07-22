package com.epam.DesignPatterns.AdapterPatterns;

public class AdapterPattern 
{
   public static void main(String[] args) {
      Player player = new Player();
      player.play("mp3", "ocean.mkv");
      player.play("mp4", "alone.mp4");
      player.play("vlc", "far far away.vlc");
      player.play("avi", "mind me.avi");
      
   }
}