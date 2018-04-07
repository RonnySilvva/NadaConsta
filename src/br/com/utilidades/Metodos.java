package br.com.utilidades;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.conexao.Pessoa;

public class Metodos {

	
public List<Pessoa> listando(String nome,String cpf){
	
	//PrintWriter out =response.getWriter();
	 
	 SessionFactory factory = new Configuration().configure().buildSessionFactory();
	 Session session = factory.openSession();
	 session.beginTransaction();
	 
	 List<Pessoa> listForm = new ArrayList<>();
	 
	listForm = session.createQuery("from Pessoa where cpf like '"+cpf+"' and nome like '%"+nome+"%'").list();
	 
	 int tamanho = listForm.size();
	 
	 for(int i=0;i<tamanho;i++){
		 listForm.get(i);
		// out.println(pessoa.getId()+" - "+ pessoa.getNome());
	 }

	 /**if(listForm.isEmpty()){
		 String msg = "Não foi encontrado nenhum resultado";
	 }
	 **/
	return listForm;
}
}
