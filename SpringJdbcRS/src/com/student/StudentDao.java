package com.student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public List<Student> getAllStudents(){  
		 return jdbcTemplate.query("select * from student",new ResultSetExtractor<List<Student>>(){  
		    @Override  
		     public List<Student> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<Student> list=new ArrayList<Student>();  
		        while(rs.next()){  
		        Student s=new Student();  
		        s.setId(rs.getInt(1));  
		        s.setName(rs.getString(2));  
		        s.setAge(rs.getInt(3));  
		        list.add(s);  
		        }  
		        return list;  
		        }  
		    });  
		  }   
}  

