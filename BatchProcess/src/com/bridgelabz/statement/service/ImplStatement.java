package com.bridgelabz.statement.service;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.Statement;

import com.bridgelabz.statement.model.Collage;
import com.bridgelabz.statement.repository.Connectivity;
//import com.mysql.cj.jdbc.CallableStatement;

public class ImplStatement implements ICrudStatement {

	static Connection connection = Connectivity.getConnection();
	static Statement st = null;

	// purpose : to insert value in the table

	@Override
	public void createTable(Collage collage) throws Exception {

		String query = ("insert into Collage values('" + collage.getId() + "','" + collage.getName() + "','"
				+ collage.getAddress() + "')");// "insert into Collage values(?,?,?)";
		System.out.println(collage.getId() + " " + collage.getName() + " " + collage.getAddress());
		st = connection.createStatement();
		st.executeUpdate(query);
//		CallableStatement cs = (CallableStatement) connection.prepareCall("call insert_record(?,?,?)");
//		cs.setInt(1, collage.getId());
//		cs.setString(2, collage.getName());
//		cs.setString(3, collage.getAddress());
//		int rowAffected = cs.executeUpdate();

	}

	// purpose : to update the value in the table

	@Override
	public int update(int id, Object Collage) throws Exception {

		String query = ("UPDATE Collage SET Name=?, SET Address=?, Where ID=?");

		st = connection.createStatement();

		return st.executeUpdate(query);

	}

	// purpose : to delete the specific row from the table

	@Override
	public int delete(int id) throws Exception {
		String query = "delete from  Collage where ID='" + id + "'";
		st = connection.createStatement();

		return st.executeUpdate(query);

	}

	// purpose : to print the whole table

	@Override
	public void showTable() throws Exception {
	// cs = (CallableStatement) connection.prepareCall("call show_records");
		String query = "select * from  Collage";
		st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);

//		ResultSet rs = cs.executeQuery();

		while (rs.next()) {
			System.out.println("Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Address " + rs.getString(3));
		}

	}

}
