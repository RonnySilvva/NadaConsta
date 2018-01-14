package conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
	//CONEXÃO COM O BANCO DE DADOS
	private Connection connection;
	
	public PessoaDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
/**	public void pesquisa(Pessoa pessoa) throws SQLException{
		
		Connection connection = new ConnectionFactory().getConnection();
			//PREPARED STATNEBT PARA PESQUISA
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
**/	
	public List<Pessoa> getLista(){
		try{
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from TabelaForm where nome = 'Jose'");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				//criando obj Pessoa
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(rs.getString("nome"));
				pessoa.setCpf(rs.getString("cpf"));
				
				//adicionando obj a lista
				pessoas.add(pessoa);
			}
			rs.close();
			stmt.close();
			return pessoas;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}

	}
	
}
