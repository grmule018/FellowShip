/******************************************************************************

 *  Purpose: this is interface for CRUD operation using statement
 *  @author Ganesh Mule
 *  @version 1.0
 *  @since 4/10/2019
 *
 ******************************************************************************/
package com.bridgelabz.statement.service;

import com.bridgelabz.statement.model.Collage;

public interface ICrudStatement {

	int delete(int id) throws Exception;

	int update(int id, Object collage) throws Exception;

	void createTable(Collage collage) throws Exception;

	void showTable() throws Exception;

}
