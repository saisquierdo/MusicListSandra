/**********************************************************	
• Author: sari	
  name: Sandra Regina Isquierdo
• Date	:	2018/01/01	
***********************************************************/


package com.sandra.musiclist.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import com.sandra.musiclist.data.DataManagerSQLite;
import com.sandra.musiclist.user.UserDAO;

public class DataManagerSQLite implements IDataManager {

	private final Logger LOG = LogManager.getLogger(DataManagerSQLite.class);
	private static DataManagerSQLite oneInstance = new DataManagerSQLite();
	private String databaseFile = "jdbc:sqlite:database/sandra";
	private Connection connection = null;
	
	private DataManagerSQLite() {} 
	
	public static DataManagerSQLite getInstance() {
		return oneInstance;
	}
	
	//@Override
	public Connection getConnectionObject() throws SQLException {
		LOG.debug("Database connection ini");
		this.databaseFile = "jdbc:sqlite:database/sandra";
		if (this.databaseFile != null) {
			this.connection = DriverManager.getConnection(this.databaseFile);
			LOG.debug("Database connection established");
		} else {
			connection = null;
		}	
		return connection;
	}
	
	//@Override
	public void disconnect() throws SQLException {
		connection.close();
		LOG.debug("Database connection established");
	}

}
