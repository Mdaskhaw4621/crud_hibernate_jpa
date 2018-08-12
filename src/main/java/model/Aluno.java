package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {

	@Id
	private int id_aluno;
	
	@Column
	private String nome_aluno;
	
	@Column 
	private int idade_aluno;
	
	@Column
	private String enderec_aluno;
	
	public int getId() {
		return id_aluno;
	}
	
	public void setId(int id) {
		this.id_aluno = id;
	}
	
	public String getNome() {
		return nome_aluno;
	}
	
	public void setNome(String nome) {
		this.nome_aluno = nome;
	}
	public int getIdade() {
		return idade_aluno;
	}
	
	public void setIdade(int idade) {
		this.idade_aluno = idade;
	}
	
	public String getEnderec() {
		return enderec_aluno;
	}
	
	public void setEnderec(String endereco) {
		this.enderec_aluno = endereco;
	}
	
}
