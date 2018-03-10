/**********************************************************	
• Author: sari	
  name: Sandra Regina Isquierdo
• Date	:	2018/01/01	
***********************************************************/


package com.sandra.musiclist.music;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.sandra.musiclist.menu.MenuBuilder;
import com.sandra.musiclist.music.Music;

public class MusicViewModel {
	ArrayList<Music> musicList;
	Scanner input = new Scanner(System.in);
	
	public MusicViewModel(ArrayList<Music> musicList) {
		this.musicList = musicList;
	}
	
	public void DisplayMusicList() {
		
		System.out.println("\n");
		System.out.println("............................................ MUSIC LIST VIEWER ............................................");
		System.out.println("\n");
		System.out.print(String.format("%-3s","ID") + " | " + String.format("%-20s","Song Name") + " | " );
		System.out.println(String.format("%-15s","Artist") + " | " + String.format("%-10s","Published") + " | " + String.format("%-15s","songUrl"));
		System.out.println("----------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i<=musicList.size()-1;i++) {
			
				System.out.print(String.format("%-3s",musicList.get(i).musicID) + " | " + String.format("%-20s",musicList.get(i).songName) + " | " );
				System.out.println(String.format("%-15s",musicList.get(i).artist) + " | " + musicList.get(i).yearPublished + " | " + musicList.get(i).songUrl);

		}
		
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		 System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
		Back();
	}
	
	public void Back() {
		MenuBuilder menu = new MenuBuilder();
		menu.IniMenu();
	}
}
