import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class hiii {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	//	System.out.println("hi");
		
		String sql= "select * from employees ";
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/sql_hr";
		String username="root";
		String password="2003";
		Connection con=DriverManager.getConnection(url,username,password);
	
		Statement st=con.createStatement();
		ResultSet rs =st.executeQuery(sql);
//		rs.next();
//		
//		String name= rs.getString(1);
//		System.out.println(name);
//	
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();

		while (rs.next()) {
		    for (int i = 1; i <= columnCount; i++) {
		        String columnName = rsmd.getColumnName(i);
		        Object value = rs.getObject(columnName);
		        System.out.print(columnName + ": " + value + "\t");
		    }
		    System.out.println();
		}
		con.close();
	}

}
