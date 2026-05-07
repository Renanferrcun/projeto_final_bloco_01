package projeto.repository;

import projeto.model.Produto;

public interface MenuRepository {
	
	    void cadastrar(Produto produto);
	    void listarTodos();
	    Produto buscarPorId(int id);
	    void atualizar(Produto produto);
	    void deletar(int id);
}
