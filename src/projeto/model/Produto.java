package projeto.model;

public abstract class Produto {

    private int id;
    private String nome;
    private double preco;
    private int vagas;
    private int quantidadeTurmas;

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


    
    public void visualizar() {
        System.out.println("===== Curso =====");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Vagas:  " + getVagas());
        System.out.println("Quantidade de turmas: " + getQuantidadeTurmas());
        System.out.println();    
        }
    

}