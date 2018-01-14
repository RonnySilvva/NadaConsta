

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DadosLogin
 */
@WebServlet("/DadosLogin")
public class DadosLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DadosLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	/** Abaixo o metodo servlet em que  **/
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		   String certo="deu certo";
		    String erro="deu errado";


		    String login = request.getParameter("login");
		      String password = request.getParameter("password");
		      
		      if(login.equals("admin") && password.equals("admin")){

		    	    request.setAttribute("certo", certo); 
		    	   RequestDispatcher rd=request.getRequestDispatcher("/PaginaFormulario.jsp");
		    	    rd.forward(request, response);


		    	    }else{
		    	   request.setAttribute("erro", erro); 
		    	   RequestDispatcher rd=request.getRequestDispatcher("/pagina_erro.jsp");
		    	    rd.forward(request, response);

		    	}

		    	}
		
	}
