/**********************************************************	
• Author: sari	
  name: Sandra Regina Isquierdo
• Date	:	2018/01/01	
***********************************************************/


package com.sandra.musiclist.menu;

public class MenuItem {
	
	int menuId;
	String itemMenu;
	String headerDescrition;
	boolean isHeader;
	
	public MenuItem(int menuId, String itemMenu,String headerDescrition, boolean isHeader) {
		this.menuId = menuId;
		this.itemMenu = itemMenu;
		this.isHeader = isHeader;
		this.headerDescrition = headerDescrition;
	}
	
	
	
	
}
