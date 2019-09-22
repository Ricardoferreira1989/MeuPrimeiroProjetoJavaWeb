package servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javafx.scene.chart.PieChart.Data;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/Cadastro")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		
		// pegando os parametros do request
		String nome = request.getParameter("name");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		String dataEmTexto = request.getParameter("dataNascimento");
		
			//out.print(dataEmTexto);
			//DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			//LocalDate data = LocalDate.parse(dataEmTexto, formato);
			
			//Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			
			out.println(" ");
			out.println(" ");
			out.println("\n Cadastro de " + nome + "\n Nascido em "+ dataEmTexto + 
					 "\n Endereço " + endereco + "\n Email "
					 		+ email + " Adicionado com sucesso!"	
					 );
			out.println(" ");
			out.println(" ");
			

		

		
		// imprime o nome do local que foi adicionado
		

		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
