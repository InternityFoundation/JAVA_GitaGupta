import java.sql.*;

public class FetchData
{
	public static void main(String[] args) throws Exception
	{
		String query = "select * from InternInformation";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "gita1611");
		Statement stat=con.createStatement();
		ResultSet rs=stat.executeQuery(query);
		
		String InternData="";
		while(rs.next())
		{
			InternData=rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4);
			System.out.println(InternData);
		}
		stat.close();
		con.close();	
	}
}
