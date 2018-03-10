/**********************************************************	
• Author: sari	
  name: Sandra Regina Isquierdo
• Date	:	2018/01/01	
***********************************************************/

package com.sandra.musiclist.music;

import java.util.ArrayList;

public interface IMusicListDAO {
	public ArrayList<Music> getMusicList(int userMusciId);
	public Music getMusic(int musicID);
	public int addMusic( Music aMusic);
	public void updateMusic( Music aMusic);
	public void deleteMusic( Music aMusic);
	public String printMusicList( int userMusicID);
}
