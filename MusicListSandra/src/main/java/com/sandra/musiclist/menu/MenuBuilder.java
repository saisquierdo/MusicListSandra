/**********************************************************	
• Author: sari	
  name: Sandra Regina Isquierdo
• Date	:	2018/01/01	
***********************************************************/

package com.sandra.musiclist.menu;
import java.awt.List;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class MenuBuilder {
	
	ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
	
	public MenuBuilder() {}
	
	public void IniMenu() {
		
		// Review Headings
		menuList.add (new MenuItem(0,"Review","Music and Life playlist review",true));
		//Review Menu Item
		menuList.add(new MenuItem(1,
				"List Playlists",
				"List the playlists available in the system",
				false));
		
		menuList.add(new MenuItem(2,
				"List Music",
				"List the music available in the system",
				false));
		
		menuList.add(new MenuItem(3,
				"List Users",
				"List the users in the system",
				false));
		
		
		// Maintenance Headings		
		menuList.add (new MenuItem(0,"Maintenance","Add users, playlists and music",true));	
		
		//Maintenance Menu Item
		menuList.add(new MenuItem(4,
				"Add User",
				"Add a user",
				false));
		
		menuList.add(new MenuItem(5,
				"Add Music",
				"Add music",
				false));
		
		menuList.add(new MenuItem(6,
				"Add Playlist",
				"Add a playlist",
				false));
		menuList.add(new MenuItem(7,
				"Edit Music",
				"Edit music",
				false));
		
		menuList.add(new MenuItem(8,
				"Edit Playlist",
				"Edit a playlist",
				false));
				
					
		// Administration Headings				
		menuList.add (new MenuItem(0,"Administration","Music and Life program administration options",true));
		//Administration Menu Item
		menuList.add(new MenuItem(9,
				"Remove a User",
				"Remove a user",
				false));
		
		menuList.add(new MenuItem(10,
				"Remove Music",
				"Remove music",
				false));
		
		menuList.add(new MenuItem(11,
				"Remove a Playlist",
				"Remove a playlist",
				false));
		
		DisplayMenu();
	}
	
	void DisplayMenu() {
		Menu menu = new Menu(menuList);
		menu.DisplayMenu();
	}

}
