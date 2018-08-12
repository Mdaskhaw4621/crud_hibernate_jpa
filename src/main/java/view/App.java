package view;

import javax.swing.JFrame;

import controller.AlunoJpaDAO;
import model.Aluno;

public class App 
{
    public static void main( String[] args )
    {
        Aluno aluno = new Aluno();
        	aluno.setId(1);
        	aluno.setNome("Moises Marques");
        	aluno.setIdade(16);
        	aluno.setEnderec("Rua dos Sonhos, 123");
        	AlunoJpaDAO.getInstance().merge(aluno);
        	System.out.println("Objetos salvos com sucesso!");
    }
}
