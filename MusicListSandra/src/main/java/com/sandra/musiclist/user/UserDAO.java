package com.sandra.musiclist.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sandra.musiclist.data.IDataManager;
import com.sandra.musiclist.user.User;



public class UserDAO implements IUserDAO {
	
	private IDataManager dataManager;
	
	// This is added to every class that needs to log with one change
	// The getLogger( ) part should contain the name of the class its in
	// So you know the messages that came from objects of this class
	private final Logger LOG = LogManager.getLogger(UserDAO.class);
	
	public UserDAO(IDataManager dataManager ) {
		
		this.dataManager = dataManager;
	}

	public ArrayList<User> getAllUsers() {
		ArrayList<User> userList = new ArrayList<User>();
		
		// Get JDBC connection to database
		Connection connection = null;
		
        try
        {
        	  // get a database connection
        	connection = this.dataManager.getConnectionObject();
        			       	
          Statement statement = connection.createStatement();
          statement.setQueryTimeout(30);  // set timeout to 30 sec.
          
          // Run the query
          
          ResultSet resultSet = statement.executeQuery("select * from user");
          
          // iterate through the results create User objects put in the ListArray
          
          while(resultSet.next())
          {
        	  	  User user  = new User(
        	  			  resultSet.getInt("userID"),
        	  			  resultSet.getString("firtsName"),
        	  			  resultSet.getString("lastName"),
        	  			  resultSet.getString("email")        	  			  
        	  			  );
              
              // putting the user objects into the list but not using them yet
              userList.add(user);
              
              // print the results by using the toString() on User
              LOG.debug( "User object : " + user);
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
        
        return userList;

	}

	public User getUser(int userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public int addUser(User aUser) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void updateUser(User aUser) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(User aUser) {
		// TODO Auto-generated method stub
		
	}

	public String printUser(int userID) {
		// TODO Auto-generated method stub
		return null;
	}

}
