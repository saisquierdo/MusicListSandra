package com.sandra.musiclist.user;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.sandra.musiclist.menu.MenuBuilder;
import com.sandra.musiclist.user.User;

public class UserViewModel {
	
	ArrayList<User> userList;
	Scanner input = new Scanner(System.in);
	
	public UserViewModel(ArrayList<User> userList) {
		this.userList = userList;
	}
	
	public void setUserList( ArrayList<User> userList) {
		
	}
	
	public void displayUserList() {
		
		System.out.println("\n");
		System.out.println("............................................ USER LIST VIEWER ............................................");
		System.out.println("\n");
		System.out.print(String.format("%-3s","ID") + " | " + String.format("%-20s","First Name") + " | " );
		System.out.println(String.format("%-20s","Last Name") + " | Email");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i<=userList.size()-1;i++) {
			
				System.out.print(String.format("%-3s",userList.get(i).userID) + " | " + String.format("%-20s",userList.get(i).firtsName) + " | " );
				System.out.println(String.format("%-20s",userList.get(i).lastName) + " | " + userList.get(i).email
						);

		}
		
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		 System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
		Back();
	}
	
	public void Back() {
		MenuBuilder menu = new MenuBuilder();
		menu.IniMenu();
	}
	
	

}
