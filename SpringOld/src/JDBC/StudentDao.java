package JDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Student> getAllStudentsRowMapper(){
		return jdbcTemplate.query("select * from Student",new RowMapper<Student>(){
		@Override
		public Student mapRow(ResultSet rs, int rownumber) throws SQLException {
			Student e=new Student();
			e.setSid(rs.getInt(1));
			e.setSname(rs.getString(2));
			e.setSalary(rs.getInt(3));
		return e;
		}
		});
		}

	/*
	public List<Student> getAllStudent(){
		return jdbcTemplate.query("select * from Student",new ResultSetExtractor<List<Student>>(){
		

		@Override
		public List<Student> extractData(ResultSet rs) throws SQLException,
		DataAccessException {

		List<Student> list=new ArrayList();
		while(rs.next()){
			Student e=new Student();
		e.setSid(rs.getInt(1));
		e.setSname(rs.getString(2));
		e.setSalary(rs.getInt(3));
		list.add(e);
		}
		return list;
		}
		});
	}	
	public Boolean saveEmployeeByPreparedStatement(final Student e){
		String query="insert into Student values(?,?,?)";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){
			
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setInt(1,e.getSid());
				ps.setString(2,e.getSname());
				ps.setFloat(3,e.getSalary());
				return ps.execute();
			}
			
		});
	}
	
	
	
//-----------------------------------------Normal-------------------------
	public int saveEmployee(Student e){
	String query="insert into Student values('"+e.getSid()+"','"+e.getSname()+"','"+e.getSalary()+"')";
	return jdbcTemplate.update(query);
	}
	public int updateEmployee(Student e){
	String query="update Student set name='"+e.getSname()+"',salary='"+e.getSalary()+"' where id='"+e.getSid()+"' ";
	return jdbcTemplate.update(query);
	}
	public int deleteEmployee(Student e){
	String query="delete from Student where id='"+e.getSid()+"' ";
	return jdbcTemplate.update(query);
	}*/


}
