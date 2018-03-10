/**********************************************************	
• Author: sari	
  name: Sandra Regina Isquierdo
• Date	:	2018/01/01	
***********************************************************/

package com.sandra.musiclist.music;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.sandra.musiclist.data.DataManagerSQLite;
import com.sandra.musiclist.menu.ConsoleControls;
import com.sandra.musiclist.menu.MenuBuilder;

public class PlayListViewModel {
	ArrayList<PlayList> playList;
	Scanner input = new Scanner(System.in);
	
	private int selectedOption;
	
	public PlayListViewModel(ArrayList<PlayList> playList) {
		this.playList = playList;
	}
	
	public void DisplayPlayList() {
		
		ConsoleControls.clearConsole();
		System.out.println("\n");
		System.out.println( ".................... PLAY LIST VIEWER ....................");
		System.out.println("\n");
		System.out.println(String.format("%-2s","ID") + " | " + String.format("%-20s","List Name") + " | " + String.format("%-20s","Theme")  );
		System.out.println("------------------------------------------------------------");
		
		for(int i = 0; i<=playList.size()-1;i++) {
			
			System.out.println(String.format("%-2s",playList.get(i).userMusicID) + " | " + String.format("%-20s",playList.get(i).listName) + " | " + playList.get(i).theme);

		}
		System.out.println("------------------------------------------------------------");
		
		System.out.println("\nEnter 0 to back to main menu or a menu number to select the music list --> ");
		this.selectedOption = this.input.nextInt();
		HandleMenu();
	}
	
	public void HandleMenu() {
		if(this.selectedOption==0) {
			Back();
		}
		else {
			ShowListMusic();
			
		}
	}
	
	private void ShowListMusic() {
		ConsoleControls.clearConsole();
		
		System.out.println("List Music");
		
		MusicListDAO objMusicList = new MusicListDAO(DataManagerSQLite.getInstance() );
		ArrayList<Music> musicList = new ArrayList<Music>();
		musicList = objMusicList.getMusicList(this.selectedOption);
		
		MusicViewModel view = new MusicViewModel(musicList);
		
		view.DisplayMusicList();
	}
	
	public void Back() {
		MenuBuilder menu = new MenuBuilder();
		menu.IniMenu();
	}
	
}
