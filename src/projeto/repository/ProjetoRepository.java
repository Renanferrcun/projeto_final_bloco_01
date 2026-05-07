package projeto.repository;

import projeto.model.Curso;
import projeto.model.Produto;

// Interface para definir as operações CRUD para cursos
public interface ProjetoRepository {

	// Métodos para operações CRUD para cursos
	void cadastrar(Curso curso);

	void listarTodos();

	Produto buscarPorId(int id);

	void atualizar(Curso curso);

	void deletar(int id);
}
