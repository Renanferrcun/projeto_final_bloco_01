package projeto.model;

    // Classe abstrata Produto que serve como base para os cursos
public abstract class Produto {

	// Atributos
	private int id;
	private String nome;
	private double preco;
	private int vagas;
	private int quantidadeTurmas;

	// Método Construtor
	public Produto(int id, String nome, double preco, int vagas, int quantidadeTurmas) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.vagas = vagas;
		this.quantidadeTurmas = quantidadeTurmas;
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public int getQuantidadeTurmas() {
		return quantidadeTurmas;
	}

	public void setQuantidadeTurmas(int quantidadeTurmas) {
		this.quantidadeTurmas = quantidadeTurmas;
	}
}