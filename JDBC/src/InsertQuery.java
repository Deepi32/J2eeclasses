import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {

	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Connection con=ConnectionManager.getConnection();
		Statement st=con.createStatement();
		String query="insert into employee values(102,'nisha',230000)";
		int count=st.executeUpdate(query);
		System.out.println("Added insert item is :"+count);
		
	}
}
