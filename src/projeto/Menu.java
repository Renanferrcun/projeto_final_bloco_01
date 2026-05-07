package projeto;

import java.util.InputMismatchException;
import java.util.Scanner;
import projeto.controller.MenuController;
import projeto.model.Curso;

public class Menu {

	// Scanner para leitura de entrada do usuário
	private static final Scanner leia = new Scanner(System.in);
	// Instância do MenuController para gerenciar os cursos
	private static final MenuController menuController = new MenuController();

	public static void main(String[] args) {

		// Criar cursos de teste
		criarCursosDeTeste();
		 

		int opcao;

		// Loop principal do menu
		while (true) {

			// Exibe o menu Generation Java01 E-Commerce
			exibirMenu();

			// Lê a opção escolhida pelo usuário com exceção para entradas inválidas
			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida! Digite um número.");
				leia.nextLine();
				continue;
			}

			// Processa a opção escolhida
			switch (opcao) {
			case 1:
				System.out.println("Opção 1 \n");
				cadastrarCurso();

				keyPress();
				break;
			case 2:
				System.out.println("Opção 2 \n");
				menuController.listarTodos();

				keyPress();
				break;
			case 3:
				System.out.println("Opção 3 \n");
				atualizarCurso();

				keyPress();
				break;
			case 4:
				System.out.println("Opção 4 \n");
				excluirCurso();

				keyPress();
				break;
			case 0:
				System.out.println("Finalizando programa...");
				System.exit(0);
			default:
				System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
			}
			System.out.println();

		}
	}

	// Método para exibir o menu
	public static void exibirMenu() {
		System.out.println("*=*=*=*=*=*=====================================*=*=*=*=*=*=*");
		System.out.println("*=*=*=*=*=*| Menu Generation Java01 E-Commerce |*=*=*=*=*=*=*");
		System.out.println("*=*=*=*=*=*=====================================*=*=*=*=*=*=*");
		System.out.println("*		  1. Cadastrar Curso		 	   *");
		System.out.println("*		  2. Listar Cursos			   *");
		System.out.println("*		  3. Atualizar Curso			   *");
		System.out.println("*		  4. Excluir Curso			   *");
		System.out.println("*		  0. Sair				   *");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("Escolha uma opção: ");

	}

	// Métodos para cada opção do menu
	public static void cadastrarCurso() {
		System.out.println("Cadastro de Curso");

		System.out.print("Digite o nome do curso: ");
		String nome = leia.nextLine();

		System.out.print("Digite o preço do curso: ");
		double preco = leia.nextDouble();
		leia.nextLine(); 

		System.out.print("Digite a quantidade de vagas: ");
		int vagas = leia.nextInt();
		leia.nextLine(); 

		System.out.print("Digite a quantidade de turmas: ");
		int quantidadeTurmas = leia.nextInt();
		leia.nextLine(); 

		System.out.print("Digite a categoria do curso: ");
		String categoria = leia.nextLine(); 

		System.out.print("Digite a carga horária do curso: ");
		int cargaHoraria = leia.nextInt();
		leia.skip("\\R"); 

		System.out.print("Digite a descrição do curso: ");
		String descricao = leia.nextLine();

		// Gerar ID automaticamente e cadastrar o curso
		menuController.cadastrar(new Curso(menuController.gerarId(), nome, preco, vagas, quantidadeTurmas, categoria,
				cargaHoraria, descricao));
	}

	// Método para atualizar um curso existente
	public static void atualizarCurso() {
		System.out.println("Atualização de Curso");
		System.out.print("Digite o ID do curso a ser atualizado: ");
		int id = leia.nextInt();
		leia.nextLine();

		// Buscar o curso pelo ID para verificar se existe antes de atualizar
		Curso curso = menuController.buscarPorId(id);

		if (curso != null) {

			System.out.print("Digite o novo nome do curso: ");
			String nome = leia.nextLine();
			System.out.print("Digite o novo preço do curso: ");
			double preco = leia.nextDouble();
			leia.nextLine(); 

			System.out.print("Digite a nova quantidade de vagas: ");
			int vagas = leia.nextInt();
			leia.nextLine(); 

			System.out.print("Digite a nova quantidade de turmas: ");
			int quantidadeTurmas = leia.nextInt();
			leia.nextLine(); 

			System.out.print("Digite a nova categoria do curso: ");
			String categoria = leia.nextLine();

			System.out.print("Digite a nova carga horária do curso: ");
			int cargaHoraria = leia.nextInt();
			leia.skip("\\R"); 

			System.out.print("Digite a nova descrição do curso: ");
			String descricao = leia.nextLine();

			menuController
					.atualizar(new Curso(id, nome, preco, vagas, quantidadeTurmas, categoria, cargaHoraria, descricao));

		} else {	// Se o curso não for encontrado, exibe uma mensagem de erro
			System.out.println("Curso não encontrado com ID: " + id);
		}

	}

	// Método para excluir um curso existente
	public static void excluirCurso() {
		System.out.println("Exclusão de Curso");
		System.out.print("\nDigite o ID do curso a ser excluído: ");
		int id = leia.nextInt();
		leia.nextLine();
		menuController.deletar(id);
	}

	// Método para pausar a execução e esperar o usuário pressionar Enter
	public static void keyPress() {
		System.out.println("\nPressione Enter para Continuar...");
		leia.nextLine();
	}

	// Método para criar cursos de teste
	private static void criarCursosDeTeste() { 
    menuController.cadastrar(new Curso(
        menuController.gerarId(), "Java Básico", 199.99, 50, 2,
        "Programação", 40, "Curso introdutório de Java"
    ));
    menuController.cadastrar(new Curso(
        menuController.gerarId(), "Spring Boot", 299.99, 30, 1,
        "Framework", 60, "Desenvolvimento web com Spring"
    ));
    menuController.cadastrar(new Curso(
        menuController.gerarId(), "Banco de Dados", 149.99, 20, 1,
        "Dados", 30, "SQL e modelagem"
    ));
}
}
