package conexao;

public class Teste {
public static void main(String[] args) throws ClassNotFoundException{
	PessoaDAO pessoa = new PessoaDAO();
	pessoa.getLista();
		System.out.println(pessoa.getLista().toString());
	}
}
