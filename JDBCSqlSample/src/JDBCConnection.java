import java.sql.*;
public class JDBCConnection
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "gita1611");
		Statement stat=con.createStatement();
		stat.executeUpdate("Create Table InternInformation(Id varchar2(5),Name varchar2(25),Stream varchar2(15),CollegeName varchar2(30))");
		System.out.println("Table created");
	}

}







//stat.executeUpdate("Create Table Details(Id varchar2(10),Name varchar2(20))");