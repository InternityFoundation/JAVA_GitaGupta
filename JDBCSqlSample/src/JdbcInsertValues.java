import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcInsertValues {
	public static void main(String[] args) throws Exception
	{
		try
		{
			//get connection
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "gita1611");
			//create a statement
			Statement stat=con.createStatement();
			//execute query
			String sql="Insert into InternInformation"
								+ "(Id,Name,Stream,CollegeName)"
								+ "VALUES('100','PRIYA SINGH','Data Structure','TECHNO INSTITUTE OF TECHNOLOGY')";
			String sql1="Insert into InternInformation"
					+ "(Id,Name,Stream,CollegeName)"
					+ "VALUES('102','ARPIT SINGHI','CLOUD COMPUTING','BP INSTITUTE OF TECHNOLOGY')";
			String sql2="Insert into InternInformation"
							+ "(Id,Name,Stream,CollegeName)"
							+ "VALUES('103','RISHI SINGHANIA','JAVA','NARULA INSTITUTE OF TECHNOLOGY')";		
			stat.executeUpdate(sql);
			stat.executeUpdate(sql1);
			stat.executeUpdate(sql2);
			System.out.println("Data inserted");
			
			
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



//ResultSet rs=stat.executeQuery("Select * from InternInformation");
		