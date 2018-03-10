/**********************************************************	
• Author: sari	
  name: Sandra Regina Isquierdo
• Date	:	2018/01/01	
***********************************************************/

package com.sandra.musiclist;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

import com.sandra.musiclist.data.DataManagerSQLite;
import com.sandra.musiclist.menu.MenuBuilder;

import joptsimple.OptionException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	
	private static Logger LOG;
	
	public static void main(String[] args)
	{
		LOG = LogManager.getLogger(App.class);
		
		// Check the log level requested
				LOG.info("Commandline requested log level:" );		
				LOG.info("Application started with log level debug:");
		new App();
	}
	public App() {
		
		MenuBuilder menuBuilder = new MenuBuilder();
		menuBuilder.IniMenu();

	}
	
}
