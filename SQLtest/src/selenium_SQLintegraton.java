
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;
 
public class selenium_SQLintegraton {
 
 
 
 @Test
 public void TestVerifyDB(){
  
  try {
                        
       // This will load the driver
    // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	 Class.forName("com.mysql.jdbc.Driver");	
     System.out.println("Driver Loaded");
   
   
 
    // Specify the path of the database
 
      //String dblocation= "C:\\Users\\PRATAP27\\Desktop\\DB\\FacebookDB1.accdb";
     	String dbUrl = "jdbc:mysql://localhost:3306/emp";	
     	
     	//Database username	
     	String username = "root";	
        
		//Database Password		
		String password = "";	
             
    // This will connect with Database , getConnection taking three argument
    //  first argument Test_Oracle is the dsn which you can change as per your system,
 
 
       //Connection con=DriverManager.getConnection("jdbc:odbc:AscentAccess;DBQ="+dblocation);
     	
		Connection con = DriverManager.getConnection(dbUrl, username, password);
       System.out.println("Connection created");
 
   // This will create statement  
        Statement smt=con.createStatement();
          
        System.out.println("Statement created");
 
   // Now execute the query, here facebook is the table which I have created in DB 
    
        ResultSet rs=  smt.executeQuery("Select * from facebook");
 
        System.out.println("Query Executed");
 
  // Iterate the resultset now
 
       while(rs.next()){
   
       String uname=    rs.getString(1);
       String pass=        rs.getString(2);
       String email=      rs.getString(3);
 
        System.out.println("Uname is "+uname+" password is "+pass + " email id is "+ email);
   
  }
}
        catch (Exception e) {
         System.out.println(e.getMessage());
  }
   
  
 }
 
}
