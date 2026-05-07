package projeto.model;

public class Curso extends Produto {

    // Atributos específicos do curso
	private String categoria;
	private int cargaHoraria;
	private String descricao;

    // Método Construtor
	public Curso(int id, String nome, double preco, int vagas, int quantidadeTurmas, String categoria, int cargaHoraria,
			String descricao) {
        // Chamada do construtor da classe mãe (Produto) para inicializar os atributos comuns
		super(id, nome, preco, vagas, quantidadeTurmas);
        // Inicialização dos atributos específicos do curso
		this.categoria = categoria;
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
	}

	// Getters e Setters
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

    // Método para exibir os detalhes do curso
	public void visualizar() {
		System.out.println("===== Curso =====");
		System.out.println("ID: " + getId());
		System.out.println("Nome: " + getNome());
		System.out.printf("Preço: R$ %.2f\n", getPreco());
		System.out.println("Vagas:  " + getVagas());
		System.out.println("Quantidade de turmas: " + getQuantidadeTurmas());
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Carga horária: " + getCargaHoraria() + "hrs");
		System.out.println("Descrição: " + getDescricao());
		System.out.println();
	}
}
