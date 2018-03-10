/**********************************************************	
• Author: sari	
  name: Sandra Regina Isquierdo
• Date	:	2018/01/01	
***********************************************************/

package com.sandra.musiclist.data;

import java.sql.Connection;
import java.sql.SQLException;

public interface IDataManager {
	public Connection getConnectionObject() throws SQLException;
	public void disconnect() throws SQLException;
}
