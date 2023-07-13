package dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTesting {

	public static void main(String[] args) throws Throwable 
	{
		//create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JUNGLE","root","root");
		Statement st = con.createStatement();
		String s="insert into Animals values('B','TION',85,108);";
		boolean result = st.execute(s);
		if(result==true)
		{
			System.out.println("data inserted");
		}
		con.close();
		

	}

}
