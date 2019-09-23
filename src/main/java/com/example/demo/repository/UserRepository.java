package com.example.demo.repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public class UserRepository {

 // we are autowiring jdbc template, 
 // using the properties we have configured spring automatically 
 // detects and creates jdbc template using the configuration
 @Autowired
 JdbcTemplate jdbcTemplate;
 
 
 public List<String> getAllUserNames() {
  List<String> userNameList = new ArrayList<>();
  userNameList.addAll(jdbcTemplate.queryForList("select name from user;", String.class));
  return userNameList;
 }
 public List<User> getDetails(String username) {
	  //List<String> userNameL = new ArrayList<>();
	 List<User> user = new ArrayList<User>() ;
	  //userNameList.addAll(jdbcTemplate.queryForList("select name from user;", String.class));
	 user.addAll(jdbcTemplate.query("select * from userdata where email='"+username+"';", 
			 (rs, rowNum) ->
     			new User(
             rs.getString("name"),
             rs.getString("email"),
             rs.getString("accno"),
             rs.getLong("Mobno"),
             rs.getString("address"),
             rs.getLong("ifsc"),
             rs.getLong("balance"))));
	 System.out.println("--------");
	 System.out.println(user);
	 System.out.println("--------");
	 return user;
	 }
	 
 
 
 
 public void add() {
	 String sql = "INSERT INTO USER " +
				"(NAME, CLASS) VALUES (?, ?)";
	 jdbcTemplate.update(sql, new Object[] {"hari","vilas"});
 }

 public boolean search(String username, String password)
 {
	 String query="select userid from logindata where userid='"+username+"' and password='"+password+"';";
	 List<String> userNameList = new ArrayList<>();
	 userNameList=jdbcTemplate.queryForList(query,String.class);
	 if(userNameList.size()==1)
		 return true;
	 else
		 return false;
 }
 public String getDate() {
	 Date date= new Date();
	 long time = date.getTime();
	 Timestamp ts = new Timestamp(time);
	 return ts.toString();
 }
 
public int transfer(String source, String dest,String date, int amount) {
	System.out.println("--"+source+"--"+dest+"--"+date+"--"+amount+"--");
	jdbcTemplate.update("insert into transaction values(?,?,?,?);",source,dest,date,amount);
	int samt=jdbcTemplate.queryForObject("select balance from userdata where email=\""+source+"\";",Integer.class);
	int damt=jdbcTemplate.queryForObject("select balance from userdata where email=\""+dest+"\";",Integer.class);
	if(samt-amount>0) {
		samt-=amount;
		damt+=amount;
	}
	else return 0;
	System.out.println("--"+source+"--"+dest+"--"+date+"--"+amount+"--");
	jdbcTemplate.update("update userdata set balance="+samt+" where email=\""+source+"\";");
	System.out.println("##source##"+source+"#dest#"+dest+"--"+date+"--"+amount+"--yes");
	jdbcTemplate.update("update userdata set balance="+damt+" where email=\""+dest+"\";");
	return 1;
}

public int addadmin(String source, String dest,String date, int amount) {
	System.out.println("--"+source+"--"+dest+"--"+date+"--"+amount+"--");
	jdbcTemplate.update("insert into transaction values(?,?,?,?);",source,dest,date,amount);
	int samt=jdbcTemplate.queryForObject("select balance from userdata where email=\""+source+"\";",Integer.class);
	int damt=jdbcTemplate.queryForObject("select balance from userdata where email=\""+dest+"\";",Integer.class);
	if(samt-amount>0) {
		samt-=amount;
		damt+=amount;
	}
	else return 0;
	System.out.println("--"+source+"--"+dest+"--"+date+"--"+amount+"--");
	jdbcTemplate.update("update userdata set balance="+samt+" where email=\""+source+"\";");
	System.out.println("##source##"+source+"#dest#"+dest+"--"+date+"--"+amount+"--yes");
	jdbcTemplate.update("update userdata set balance="+damt+" where email=\""+dest+"\";");
	return 1;
}


@Override
public String toString() {
	return "UserRepository [jdbcTemplate=" + jdbcTemplate + "]";
}
public int addAdmin(String name, String username, String accno, int mobno, String address, int ifsc, int balance) {
	int s=jdbcTemplate.update("insert into userdata values(?,?,?,?,?,?,?);",name,username,accno,mobno,address,ifsc,balance);
	System.out.println("----- "+s+"----- ");
	return s;
}
public int addAdminLogin(String username, String password, String role) {
	
	int s=jdbcTemplate.update("insert into logindata values(?,?,?);",username,password,role);
	System.out.println("----- "+s+"----- ");
	return s;
}
 
}