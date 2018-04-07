
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.conexao.*;
import br.com.utilidades.Metodos;

/**
 * Servlet implementation class DadosPaginaFormulario
 */
@WebServlet(description = "Pagina que recebe as requisições vinda da JSP index", urlPatterns = { "/DadosPaginaFormulario" })
public class DadosPaginaFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DadosPaginaFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//variavel
		Metodos metodos = new Metodos();
		PrintWriter out = response.getWriter();
		//fim variavel//
		
		String nomereq = request.getParameter("nome");
		String nome = nomereq.toString();
		
		String cpfreq = request.getParameter("cpf");
		String cpf = cpfreq.toString();
		
		metodos.listando(nome,cpf);
		
		if(nome.isEmpty()||cpf.isEmpty()){
		out.println("<meta http-equiv='refresh' content='3;URL=index.jsp'>");
		out.println("<script>alert('Nome ou cpf está incorreto ou invalido');</script>");
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("/resultado.jsp");
	 	    rd.forward(request, response);
		}
		
		//response.sendRedirect("/resultado.jsp");
		}
}
