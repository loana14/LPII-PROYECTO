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
import Modelo.Restaurante.ClassEmpleado;

/**
 * Servlet implementation class ControladorEmpleado
 */
@WebServlet("/ControladorEmpleado")
public class ControladorEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom_emp=request.getParameter("nom_emp");
		String ape_emp=request.getParameter("ape_emp");
		int dni=Integer.parseInt(request.getParameter("dni"));
		int edad=Integer.parseInt(request.getParameter("edad"));
		String fechanac_emp=request.getParameter("fechanac_emp");
		String fechaing_emp=request.getParameter("fechaing_emp");
		int rol=Integer.parseInt(request.getParameter("rol"));
		
		ClassEmpleado clem = new ClassEmpleado();	
		ClassEmpleadoImp empi = new ClassEmpleadoImp();
		
		clem.setNom_emp(nom_emp);
		clem.setApe_emp(ape_emp);
		clem.setDni(dni);
		clem.setEdad(edad);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha;
		Date fecha2;
		try {
			fecha=sdf.parse(fechanac_emp);
			fecha2=sdf.parse(fechaing_emp);
			Date fechasql=fecha;
			Date fechasql2=fecha2;
			clem.setFechanac_emp(fechasql);
			clem.setFechaing_emp(fechasql2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clem.setRol(rol);
		empi.RegistrarEmpleado(clem);
		
		List<ClassEmpleado> ListaEmpleado=empi.ListarEmpleado();
		request.setAttribute("ListaEmpleado", ListaEmpleado);
		request.getRequestDispatcher("/FrmListaEmpleado.jsp").forward(request, response);
		
	}

}
