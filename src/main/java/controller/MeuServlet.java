package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Aluno;
import modelo.AlunoDao;

@WebServlet("/chamadaservlet")
public class MeuServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String acao = request.getParameter("acao");
		
		if(acao.equals("cadastro")) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/cadastro.html");
			rd.forward(request, response);
		}else if(acao.equals("mostratodos")) {
			
			AlunoDao alunoDao = new AlunoDao();
			List<Aluno> alunos =  alunoDao.mostraTodos();
			
			request.setAttribute("alunos",alunos);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/mostratodos.jsp");
			rd.forward(request, response);
			
		}else if(acao.equals("exclui")) {
			int ra = Integer.parseInt(request.getParameter("ra"));
			
			AlunoDao alunoDao = new AlunoDao();
			alunoDao.excluiPorRa(ra);
			
			response.sendRedirect("http://localhost:8080/sistemaescolaweb/chamadaservlet?acao=mostratodos");
		}else if(acao.equals("altera")) {
			
			int ra = Integer.parseInt(request.getParameter("ra"));
			
			AlunoDao alunoDao = new AlunoDao();
			Aluno aluno = alunoDao.mostraPorRa(ra);
			
			request.setAttribute("aluno", aluno);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/altera.jsp");
			rd.forward(request, response);
			
		}
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		
		if(acao.equals("cadastro")) {
			String nome = request.getParameter("txtnome");
			double pri = Double.parseDouble(request.getParameter("txtpri"));
			double seg = Double.parseDouble(request.getParameter("txtseg"));
			double ter = Double.parseDouble(request.getParameter("txtter"));
			double qua = Double.parseDouble(request.getParameter("txtqua"));
			
			Aluno aluno = new Aluno(nome,pri,seg,ter,qua);
			
			AlunoDao alunoDao = new AlunoDao();
			alunoDao.cadastra(aluno);
			
			response.sendRedirect("http://localhost:8080/sistemaescolaweb/chamadaservlet?acao=mostratodos");
		}else if(acao.equals("altera")) {
			
			int ra = Integer.parseInt(request.getParameter("txtra"));
			String nome = request.getParameter("txtnome");
			double pri = Double.parseDouble(request.getParameter("txtpri"));
			double seg = Double.parseDouble(request.getParameter("txtseg"));
			double ter = Double.parseDouble(request.getParameter("txtter"));
			double qua = Double.parseDouble(request.getParameter("txtqua"));
			
			Aluno aluno = new Aluno(ra,nome,pri,seg,ter,qua);
			
			AlunoDao alunoDao = new AlunoDao();
			alunoDao.altera(aluno);
			
			response.sendRedirect("http://localhost:8080/sistemaescolaweb/chamadaservlet?acao=mostratodos");
			
		}
		
	}
	
	
}




