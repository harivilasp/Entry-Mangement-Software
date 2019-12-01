package com.example.demo.repository;

import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Host;
import com.example.demo.model.Time;

@Repository
public class UserRepository {

 // we are autowiring jdbc template, 
 // using the properties we have configured spring automatically 
 // detects and creates jdbc template using the configuration
 @Autowired
 JdbcTemplate jdbcTemplate;
 
 public List<Time> getVistorDetails(String email) {
	  //List<String> userNameL = new ArrayList<>();
	 List<Time> time = new ArrayList<Time>() ;
	  //userNameList.addAll(jdbcTemplate.queryForList("select name from user;", String.class));
	 time.addAll(jdbcTemplate.query("select intime,outtime from visitors where email='"+email+"';", 
			 (rs, rowNum) ->
    			new Time(
            rs.getString("intime"),
            rs.getString("outtime"))));
	 System.out.println("----getVistorDetails----");
	 return time;
	 } 

 public List<Host> getHostDetails(String hostname,String department) {
	  //List<String> userNameL = new ArrayList<>();
	 List<Host> host = new ArrayList<Host>() ;
	  //userNameList.addAll(jdbcTemplate.queryForList("select name from user;", String.class)); 
	 host.addAll(jdbcTemplate.query("select email,mobno from hostdata where name='"+hostname+"'and department='"+department+"';", 
			 (rs, rowNum) ->
   			new Host(
           rs.getString("email"),
           rs.getString("mobno"))));
	 System.out.println("---getHostDetails-----");
	 //System.out.println("select email,mobno from hostdata where name='"+hostname+"'and department='"+department+"';");
	 return host;
	 } 
 public String getDate() {
	 Date date= new Date();
	 long time = date.getTime();
	 Timestamp ts = new Timestamp(time);
	 return ts.toString();
 }
public boolean search(String name,String email,String mobno,String hostname,String department)
{
	 String query="select name from visitors where name='"+name+"' and email='"+email+"' and mobno='"+mobno+"'and hostname='"+hostname+"'and department='"+department+"'";
	 List<String> userNameList = new ArrayList<>();
	 userNameList=jdbcTemplate.queryForList(query,String.class);
	 if(userNameList.size()==1)
		 return true;
	 else
		 return false;
}

public int addVisit(String name,String email,String mobno,String hostname,String department,String intime) {
	System.out.println("--"+name+"--"+email+"--"+mobno+"--"+hostname+"--"+"--"+department);
	String outtime;
	outtime="-";
	jdbcTemplate.update("insert into visitors values(?,?,?,?,?,?,?);",name,email,mobno,hostname,department,intime,outtime);
	return 1;
}

public int checkOut(String name,String email,String mobno,String hostname,String department,String outtime) {
	System.out.println("--"+name+"--"+email+"--"+mobno+"--"+hostname+"--"+"--"+department);
	jdbcTemplate.update("update visitors set outtime='"+outtime+"' where email='"+email+"' and mobno='"+mobno+"'and hostname='"+hostname+"'and department='"+department+"';");
	return 1;
}

 
}