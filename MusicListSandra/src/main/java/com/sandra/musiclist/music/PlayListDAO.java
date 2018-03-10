/**********************************************************	
• Author: sari	
  name: Sandra Regina Isquierdo
• Date	:	2018/01/01	
***********************************************************/

package com.sandra.musiclist.music;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sandra.musiclist.data.IDataManager;

import com.sandra.musiclist.music.PlayList;

public class PlayListDAO implements IPlayListDAO {

	private IDataManager dataManager;
	private final Logger LOG = LogManager.getLogger(PlayListDAO.class);

	public PlayListDAO(IDataManager dataManager ) {
		
		this.dataManager = dataManager;
	}

	public ArrayList<PlayList> getAllMusicList() {
		ArrayList<PlayList> playList = new ArrayList<PlayList>();
		LOG.info("Start connection" );	
		// Get JDBC connection to database
		Connection connection = null;
		
        try
        {
        	  // get a database connection
        	connection = this.dataManager.getConnectionObject();
        	LOG.info("success connection" );				       	
          Statement statement = connection.createStatement();
          statement.setQueryTimeout(30);  // set timeout to 30 sec.
          
          // Run the query
          
          ResultSet resultSet = statement.executeQuery("select * from usermusic");
          
          // iterate through the results create playlist objects put in the ListArray
          while(resultSet.next())
          {
        	  PlayList playlist  = new PlayList(
	    	  			  resultSet.getInt("userMusicID"),
	    	  			  resultSet.getInt("userID"),
	    	  			  resultSet.getString("listName"),
        	  			  resultSet.getString("description"),
        	  			  resultSet.getString("theme"),
        	  			  resultSet.getString("motivation"),  
        	  			  resultSet.getString("significance")  
        	  			  );
              
              // putting the user objects into the list but not using them yet
        	  	playList.add(playlist);
              
              // print the results by using the toString() on User
              LOG.debug( "User object : " + resultSet.getInt("userMusicID") + " | " +  resultSet.getInt("userID") + " | " + resultSet.getInt("listName"));
          }
    	  
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          LOG.error(e.getMessage());
        } 
        finally
        {
          try
          {
            if(connection != null)
            	this.dataManager.disconnect();
          }
          catch(SQLException e)
          {
            // connection close failed.
            LOG.error(e.getMessage());
          }
        }
        
        return playList;

	}


	public PlayList getUserMusic(int userMusicID) {
		// TODO Auto-generated method stub
		return null;
	}


	public int addList(PlayList aPlayList) {
		// TODO Auto-generated method stub
		return 0;
	}


	public void updatePlayList(PlayList aPlayList) {
		// TODO Auto-generated method stub
		
	}


	public void deleteItemPlayList(PlayList aPlayList) {
		// TODO Auto-generated method stub
		
	}


	public String printPlayList(int userMusicID) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
