package com.example.demo.repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Transaction;
import com.example.demo.model.User;

@Repository
public class DataRepository {

 // we are autowiring jdbc template, 
 // using the properties we have configured spring automatically 
 // detects and creates jdbc template using the configuration
 @Autowired
 JdbcTemplate jdbcTemplate;
 
 public List<Transaction> showTransaction(String username) {
	 List<Transaction> transaction = new ArrayList<Transaction>() ;
	 transaction.addAll(jdbcTemplate.query("select * from transaction where `from`='"+username+"';", 
			 (rs, rowNum) ->
     			new Transaction(
             rs.getString("from"),
             rs.getString("to"),
             rs.getString("date"),
             rs.getInt("amount"))));
	 System.out.println("--------");
	 System.out.println(transaction.toString());
	 System.out.println("--------");
	 return transaction;
	 }

public List<User> getAll(String role) {
	List<String> userid = new ArrayList<String>() ;
	 userid.addAll(jdbcTemplate.queryForList("select userid from logindata where `role`='"+role+"';",String.class));
	List<User> user=new ArrayList<User>() ;
	for(int i=0;i<userid.size();i++)
	{
		user.addAll(jdbcTemplate.query("select * from userdata where email='"+userid.get(i)+"';", 
				 (rs, rowNum) ->
	     			new User(
	             rs.getString("name"),
	             rs.getString("email"),
	             rs.getString("accno"),
	             rs.getLong("Mobno"),
	             rs.getString("address"),
	             rs.getLong("ifsc"),
	             rs.getLong("balance"))));
	}
	 return user;
}

}