package teste;

import modelo.Aluno;
import modelo.AlunoDao;

public class TesteAltera {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(3,"Ilma Santos",6,7,5,5);
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.altera(aluno);

	}

}
