package com.bridgelabz.service;

import java.io.IOException;
import java.sql.SQLException;

public interface Student {
	public void addStudent() throws IOException, SQLException;
	public void removeStudent() throws IOException, SQLException;
	public void showtable() throws IOException, SQLException;
	public void updateInformation() throws IOException, SQLException; 
}
