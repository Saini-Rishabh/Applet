import java.sql.*;
class JdbcProg1
{
   public static void main(String s[]) 
   {
      try
        {		
      	    Connection conn;
      	    Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","geu");
      	    System.out.println("Connection Successful");
            conn.close();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(SQLException w)
        {
            w.printStackTrace();
        }
    }
}
