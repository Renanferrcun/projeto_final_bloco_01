package projeto.model;

public class Curso extends Produto {

    private String categoria;
    private int cargaHoraria;
    private String descricao;

    public Curso(int id, String nome, double preco, int vagas, int quantidadeTurmas, String descricao, String categoria, int cargaHoraria) {
        super(id, nome, preco, vagas, quantidadeTurmas);
        this.categoria = categoria;
        this.cargaHoraria = cargaHoraria;
        this.descricao = descricao;
    }

    // Getters e Setters 
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

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

    @Override
    public void visualizar() {
        System.out.println("===== Curso =====");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Vagas:  " + getVagas());
        System.out.println("Quantidade de turmas: " + getQuantidadeTurmas());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Carga horária: " + getCargaHoraria() + "h");
        System.out.println("Descrição: " + getDescricao());
        System.out.println();
    }
    
}
