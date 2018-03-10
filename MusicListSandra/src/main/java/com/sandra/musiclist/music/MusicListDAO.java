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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sandra.musiclist.data.IDataManager;

public class MusicListDAO implements IMusicListDAO {

	private IDataManager dataManager;
	private final Logger LOG = LogManager.getLogger(PlayListDAO.class);

	public MusicListDAO(IDataManager dataManager ) {
		
		this.dataManager = dataManager;
	}
	
	public ArrayList<Music> getMusicList(int userMusciId) {
		ArrayList<Music> musicList = new ArrayList<Music>();
		
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
          
         ResultSet resultSet = statement.executeQuery("select * from music where userMusciId = " + userMusciId);
          // iterate through the results create playlist objects put in the ListArray
                 
         DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         
          while(resultSet.next())
          {
        	  Music music  = new Music(
	    	  			  resultSet.getInt("musicID"),
	    	  			  resultSet.getInt("userMusciId"),
	    	  			  resultSet.getString("songName"),
        	  			  resultSet.getString("artist"),
        	  			  resultSet.getString("yearPublished"),
        	  			  resultSet.getString("songUrl"),  
        	  			  resultSet.getString("description") ,
        	  			  resultSet.getString("why"),
        	  			  resultSet.getString("parentAnotation")  
        	  			  );
              
              // putting the user objects into the list but not using them yet
        	  musicList.add(music);
              
              // print the results by using the toString() on User
              LOG.debug( "User object : " + music);
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
        
        return musicList;

	}

	public Music getMusic(int musicID) {
		// TODO Auto-generated method stub
		return null;
	}

	public int addMusic(Music aMusic) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void updateMusic(Music aMusic) {
		// TODO Auto-generated method stub
		
	}

	public void deleteMusic(Music aMusic) {
		// TODO Auto-generated method stub
		
	}

	public String printMusicList(int userMusicID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
