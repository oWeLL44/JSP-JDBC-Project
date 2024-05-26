package teste;

import java.util.List;

import modelo.Aluno;
import modelo.AlunoDao;

public class TesteMostraTodosAlunos {

	public static void main(String[] args) {
		
		AlunoDao alunoDao = new AlunoDao();
		List<Aluno> alunos = alunoDao.mostraTodos();
		
		for(Aluno aluno:alunos) {
			System.out.println("RA: " + aluno.getRa());
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("1º Bimestre: " + aluno.getPrim());
			System.out.println("2º Bimestre: " + aluno.getSeg());
			System.out.println("3º Bimestre: " + aluno.getTer());
			System.out.println("4º Bimestre: " + aluno.getQua());
			System.out.println("Média: " + aluno.getMedia());
			System.out.println("Status Final: " + aluno.getStatusFinal());
			System.out.println();
		}
		

	}

}
