package Controlador.Restaurante;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Restaurante.ClassEmpleadoImp;
import DAO.Restaurante.ClassUsuarioimp;
import Modelo.Restaurante.ClassEmpleado;
import Modelo.Restaurante.ClassUsuario;

/**
 * Servlet implementation class ControladorUsuario
 */
@WebServlet("/ControladorUsuario")
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nom_usu=request.getParameter("nom_usu");
		String pass_usu=request.getParameter("pas_usu");
		
		String msj="";
		String url="";
		
		ClassUsuario clusu =new ClassUsuario();
		
		clusu.setNom_usu(nom_usu);
		clusu.setPas_usu(pass_usu);
		
		ClassUsuarioimp crudusu = new ClassUsuarioimp();
		ClassUsuario valusu = crudusu.ValidarUsuario(clusu);
		
		if(valusu.getNom_usu()!=null && valusu.getPas_usu()!=null){
			msj="Credenciales correctas";
			url="/Main.jsp";
		}else{
			msj="Credenciales incorrectas";
			url="/Index.jsp";
		}
		request.setAttribute("msj", msj);
		request.getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
