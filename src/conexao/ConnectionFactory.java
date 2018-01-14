package conexao;
import java.sql.*;


public class ConnectionFactory {
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/dados" , "root" , "3011");
		}catch(SQLException | ClassNotFoundException e){
			throw new RuntimeException(e);
		}
	}
}
