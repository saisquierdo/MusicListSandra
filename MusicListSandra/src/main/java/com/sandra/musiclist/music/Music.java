/**********************************************************	
• Author: sari	
  name: Sandra Regina Isquierdo
• Date	:	2018/01/01	
***********************************************************/

package com.sandra.musiclist.music;

import java.util.Date;

public class Music {
	int musicID;
	int userMusciId;
	String songName;
	String artist;
	String yearPublished;
	String songUrl;
	String description;
	String why;	
	String parentAnotation;
	
	public Music(int musicID,
			int userMusciId,
			String songName,
			String artist,
			String yearPublished,
			String songUrl,
			String description,
			String why,
			String parentAnotation) {
		
		this.musicID=musicID;
		this.userMusciId=userMusciId;
		this.songName=songName;
		this.artist=artist;
		this.yearPublished=yearPublished;
		this.songUrl=songUrl;
		this.description=description;
		this.why=why;	
		this.parentAnotation=parentAnotation;
	}
}
