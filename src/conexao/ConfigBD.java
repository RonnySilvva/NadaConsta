package conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConfigBD {

	public void adiciona(Pessoa pessoa) throws SQLException{
		Connection connection = new ConnectionFactory().getConnection();
			//PREPARED STATNEBT PARA INSERÇÃO
			PreparedStatement stmt = connection.prepareStatement("select * from TabelaForm");
			
			//executa um select
				ResultSet rs = stmt.executeQuery();
			
				//itera no ResultSet
				while(rs.next()){
				}
rs.close();
stmt.close();
connection.close();
	}
}
