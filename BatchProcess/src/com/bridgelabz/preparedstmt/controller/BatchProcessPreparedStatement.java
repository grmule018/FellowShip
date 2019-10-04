/******************************************************************************
 
 *  Purpose: program to perform batch processing using prepared statement
 *  @author Ganesh Mule.
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.preparedstmt.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bridgelabz.preparedstmt.repository.*;


public class BatchProcessPreparedStatement {

	public static int[] executeQuery() throws Exception {
		Connection connection = Connectivity.getConnection();
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
		
		String query = "insert into Collage values(?,?,?)";
		String query1="delete from Collage";
		ps = (PreparedStatement) connection.prepareStatement(query);
		ps1 = (PreparedStatement) connection.prepareStatement(query1);
		
		ps1.addBatch();
		ps.setInt(1, 8);
		ps.setString(2, "ganesh");
		ps.setString(3, "Sangli");
		ps.addBatch();

		ps.setInt(1, 9);
		ps.setString(2, "dipak");
		ps.setString(3, "pune");
		ps.addBatch();

		ps.setInt(1, 10);
		ps.setString(2, "vijay");
		ps.setString(3, "kolhapur");
		ps.addBatch();

		ps.setInt(1, 11);
		ps.setString(2, "mark");
		ps.setString(3, "chembur");
		ps.addBatch();

		ps.setInt(1, 12);
		ps.setString(2, "pooja");
		ps.setString(3, "govandi");
		ps.addBatch();

         ps1.execute();
		return ps.executeBatch();

	}

	public static void main(String[] args) throws Exception {

		System.out.println("Batch process for  prepared statement ");
		int arr[] = executeQuery();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
