package writeExcel;
import java.io.IOException;
import java.sql.*;

public class DatabaseConnection {
	

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		//String URL ="jdbc:mysql://localhost:3306/leelavathy";
		//String user = "root";
		//String Pass = "Aravind@24";
		String s = "Select ID, Name, Age from student";
		
		String insert = "Insert into student value(29,'Karthigeswari',30,80000)";
		
		Configreader Lp = new Configreader(); 
		Lp.propertiesread();
		
		/*
		 * System.out.println(Configreader.URl); System.out.println(Configreader.User);
		 * System.out.println(Configreader.Pass);
		 */
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con = DriverManager.getConnection(URL,user,Pass);
		Connection con = DriverManager.getConnection(Configreader.URL,Configreader.User,Configreader.Pass);
		Statement st = con.createStatement();
		
		st.executeUpdate(insert);
		
		System.out.println("Insert Succesfully");
		/*
		 * ResultSet rs = st.executeQuery(s);
		 * while(rs.next()) {
		 * 
		 * int id = rs.getInt("ID"); String Name = rs.getString("Name"); int Age =
		 * rs.getInt("Age"); System.out.println(id +","+Name +","+Age);
		 * 
		 * }
		 */
		con.close();
	}

}
