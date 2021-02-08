package com.employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


public class EmployeeDao {
	NamedParameterJdbcTemplate template;
	public EmployeeDao(NamedParameterJdbcTemplate template) {
		this.template=template;
	}
	@SuppressWarnings("unchecked")
	public  void save (Employee e){  
		String query="insert into employee1 values (:id,:name,:sal)";  
		  
		Map<String,Object> map=new HashMap<String,Object>();  
		map.put("id",e.getId());  
		map.put("name",e.getName());  
		map.put("sal",e.getSalary());  
		  
		template.execute(query,map,new PreparedStatementCallback() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		    }  
		});
	}
	public List<Employee> getAllEmployees(int id){
		String sql="select * from employee1 where id ="+id;
		/*Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("id",id);*/
		return template.query(sql, new ResultSetExtractor<List<Employee>>(){  
		    @Override  
		     public List<Employee> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<Employee> list=new ArrayList<Employee>();  
		        while(rs.next()){  
		        Employee e=new Employee();  
		        e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setSalary(rs.getInt(3));  
		        list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
	}
	
}
