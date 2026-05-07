package projeto.controller;

import java.util.ArrayList;
import projeto.model.Curso;
import projeto.repository.ProjetoRepository;

	// Controlador das operações relacionadas aos cursos, implementando a interface ProjetoRepository
public class MenuController implements ProjetoRepository {

	// Lista para armazenar os cursos cadastrados
	private final ArrayList<Curso> lista = new ArrayList<>();
	
	private int nextId = 0;

	// Método para cadastrar um novo curso
	@Override
	public void cadastrar(Curso curso) {
		lista.add(curso);
		System.out.println("Curso cadastrado com sucesso!");
	}

	// Método para listar todos os cursos cadastrados
	@Override
	public void listarTodos() {
		if (lista.isEmpty()) {
			System.out.println("Nenhum curso cadastrado.");
			return;
		}
		for (Curso c : lista)
			c.visualizar();

	}

	// Método para buscar um curso por ID
	@Override
	public Curso buscarPorId(int id) {
		for (Curso c : lista) {
			if (c.getId() == id)
				return c;
		}
		return null;
	}

	// Método para atualizar um curso existente
	@Override
	public void atualizar(Curso curso) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == curso.getId()) {
				lista.set(i, curso);
				System.out.println("Curso atualizado com sucesso!");
				return;
			}
		}
		System.out.println("Curso não encontrado com ID: " + curso.getId());

	}

	// Método para excluir um curso existente
	@Override
	public void deletar(int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				lista.remove(i);
				System.out.println("Curso excluído com sucesso!");
				return;
			}
		}
		System.out.println("Curso não encontrado com ID: " + id);

	}

	// Método para gerar um ID único para cada curso cadastrado
	public int gerarId() {
		return ++nextId;
	}

}