/**********************************************************	
• Author: sari	
  name: Sandra Regina Isquierdo
• Date	:	2018/01/01	
***********************************************************/


package com.sandra.musiclist.music;

public class PlayList {
	int userMusicID;
	int userID;
	String listName;
	String description;
	String theme;
	String motivation;
	String significance;
	
	public PlayList(int userMusicID,int userID,String listName,	String description, String theme, String motivation,String significance) {
		this.userMusicID=userMusicID;
		this.userID=userID;
		this.listName=listName;
		this.description=description;
		this.theme=theme;
		this.motivation=motivation;
		this.significance=significance;
	}
}
