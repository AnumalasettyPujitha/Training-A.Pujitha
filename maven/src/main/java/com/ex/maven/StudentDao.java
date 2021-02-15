package com.ex.maven;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveStudent(Student s){  
	    String query="insert into student values('"+s.getId()+"','"+s.getName()+"','"+s.getAge()+"')";  
	    return jdbcTemplate.update(query);  
	} 
	public List<Student> getAllStudents(){  
		 List li=jdbcTemplate.queryForList("select * from student");
		 return li;
	 } 
	public int updateStudent(int id,int age) {
		String query="update student set age='"+age+"' where id='"+id+"'";
		return jdbcTemplate.update(query);
	}
	public int deleteStudent(int id) {
		String query="delete from student where id='"+id+"'";
		return jdbcTemplate.update(query);
	}
}  

