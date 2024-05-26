package teste;

import modelo.Aluno;
import modelo.AlunoDao;

public class TesteCadastro {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Suzana Vieira",3,2,1,3);
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.cadastra(aluno);

	}

}
