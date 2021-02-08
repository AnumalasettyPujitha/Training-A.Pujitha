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
	  
	public Boolean saveStudent(Student s){  
		String query="insert into student values(?,?,?)";  
	    return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	    @Override  
	    public Boolean doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	              
	        ps.setInt(1,s.getId());  
	        ps.setString(2,s.getName());  
	        ps.setFloat(3,s.getAge());  
	              
	        return ps.execute();  
	              
	    }  
	    });   
	} 
	public List<Student> getAllStudents(){  
		 List li=jdbcTemplate.queryForList("select * from student");
		 return li;
	 } 
	public Boolean updateStudent(int id,int age){  
		String query="update student set age=? where id=?";  
	    return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	    @Override  
	    public Boolean doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	              
	        ps.setInt(1,age);  
	        ps.setInt(2,id);   
	              
	        return ps.execute();  
	              
	    }  
	    });   
	} 
	public Boolean deleteStudent(int id){  
		String query="delete from student where id=?";  
	    return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	    @Override  
	    public Boolean doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	                
	        ps.setInt(1,id);   
	              
	        return ps.execute();  
	              
	    }  
	    });   
	} 
}  

