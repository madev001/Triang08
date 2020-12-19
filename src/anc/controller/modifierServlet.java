package anc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anc.dao.ancDao;
import com.anc.entities.anc;
import com.anc.metier.Ianc;

/**
 * Servlet implementation class modifierServlet
 */
@WebServlet("/modifier")
public class modifierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifierServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Ianc metier = new ancDao();
		anc a = metier.findByCode(id);
		request.setAttribute("a", a);
		RequestDispatcher rd=request.getRequestDispatcher("modifierForm.jsp"); 
        rd.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int code = Integer.parseInt(request.getParameter("id"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		int age = Integer.parseInt(request.getParameter("age"));
		anc a = new anc(code, nom, prenom,age);
		Ianc metier  = new ancDao();
		metier.update(a);
		response.sendRedirect("listeProfiles");
	}

}
