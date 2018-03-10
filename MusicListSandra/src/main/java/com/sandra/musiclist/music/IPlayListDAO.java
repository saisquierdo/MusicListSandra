/**********************************************************	
• Author: sari	
  name: Sandra Regina Isquierdo
• Date	:	2018/01/01	
***********************************************************/

package com.sandra.musiclist.music;

import java.util.ArrayList;

import com.sandra.musiclist.music.PlayList;

public interface IPlayListDAO {
	public ArrayList<PlayList> getAllMusicList();
	public PlayList getUserMusic(int userMusicID);
	public int addList( PlayList aPlayList);
	public void updatePlayList( PlayList aPlayList);
	public void deleteItemPlayList( PlayList aPlayList);
	public String printPlayList( int userMusicID);
}
