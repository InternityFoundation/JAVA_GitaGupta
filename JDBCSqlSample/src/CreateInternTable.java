import java.sql.*;
public class CreateInternTable {
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "gita1611");
		Statement stat=con.createStatement();
		stat.executeUpdate("Create Table InternDetails(Id varchar2(5),Name varchar2(25),E-mail varchar2(25),CollegeName varchar2(30))");
		//stat.executeUpdate("Create Table EmpDetails(Id varchar2(10),Name varchar2(20))");
		System.out.println("Table Created");
	
	}

}
