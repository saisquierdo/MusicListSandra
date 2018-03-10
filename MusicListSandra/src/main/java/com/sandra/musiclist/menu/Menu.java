/**********************************************************	
• Author: sari	
  name: Sandra Regina Isquierdo
• Date	:	2018/01/01	
***********************************************************/


package com.sandra.musiclist.menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.sandra.musiclist.data.DataManagerSQLite;
import com.sandra.musiclist.music.Music;
import com.sandra.musiclist.music.MusicListDAO;
import com.sandra.musiclist.music.MusicViewModel;
import com.sandra.musiclist.music.PlayList;
import com.sandra.musiclist.music.PlayListDAO;
import com.sandra.musiclist.music.PlayListViewModel;
import com.sandra.musiclist.user.User;
import com.sandra.musiclist.user.UserDAO;
import com.sandra.musiclist.user.UserViewModel;

public class Menu {

	Scanner input = new Scanner(System.in);
	ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
	int selectedMenuItem;
	
	public Menu(ArrayList<MenuItem> menu) {
		this.menu = menu;
	}
	public void DisplayMenu()
	{
			
		for(int i = 0; i<=menu.size()-1;i++) {
			if(!menu.get(i).isHeader)
			{
				//Menu Item
				System.out.print(menu.get(i).menuId);
				System.out.print(" - ");
				System.out.println(menu.get(i).itemMenu);
			}
			else
			{
				//Header
				System.out.println("--------------------------------");
				System.out.println(menu.get(i).itemMenu + "  " + menu.get(i).headerDescrition );
				System.out.println("--------------------------------");

			}
		}
		
		System.out.println("\nEnter 0 to exit or a menu number to select that function --> ");
		HandleMenu();
		
		
	}
	
	public void HandleMenu() {
		
		this.selectedMenuItem = this.input.nextInt();
		
		switch ( this.selectedMenuItem) {
		case 0:
			System.out.println("Exit Menu");
			
			break;
		case 1:
			ShowPlayList();
			break;
		case 2:
			ShowListMusic();
			
			break;
		case 3:
			ShowUserList();
			
			break;
		case 4:
			System.out.println("Add User");
			break;
		case 5:
			System.out.println("Add Music");
			break;
		case 6:
			System.out.println("Add Playlist");
			break;
		case 7:
			System.out.println("Edit Music");
			break;
		case 8:
			System.out.println("Edit Playlist");
			break;
		case 9:
			System.out.println("Remove a User");
			break;
		case 10:
			System.out.println("Remove Music");
			break;
		case 11:
			System.out.println("Remove a Playlist");
			break;
			
		default:
			System.out.println("Invalid Menu Item");
			break;
		}
	
	}
	
	private void ShowPlayList() {
		
		ConsoleControls.clearConsole();
		
		PlayListDAO objPlayList = new PlayListDAO( DataManagerSQLite.getInstance() );
		ArrayList<PlayList> playList = new ArrayList<PlayList>();
		playList = objPlayList.getAllMusicList();
		
		PlayListViewModel view = new PlayListViewModel(playList);
		
		view.DisplayPlayList();
	}
	
	private void ShowListMusic() {
		ConsoleControls.clearConsole();
		
		MusicListDAO objMusicList = new MusicListDAO(DataManagerSQLite.getInstance() );
		ArrayList<Music> musicList = new ArrayList<Music>();
		musicList = objMusicList.getMusicList(this.selectedMenuItem);
		
		MusicViewModel view = new MusicViewModel(musicList);
		
		view.DisplayMusicList();
	}
	
	private void ShowUserList() {
		ConsoleControls.clearConsole();
		
		System.out.println("List Users");
		
		UserDAO objUser = new UserDAO( DataManagerSQLite.getInstance() );
		ArrayList<User> userList = new ArrayList<User>();
		userList = objUser.getAllUsers();
		
		UserViewModel view = new UserViewModel(userList);
		
		view.displayUserList();
	}
	
}
