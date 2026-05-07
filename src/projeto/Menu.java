package projeto;

import java.util.Scanner;
import projeto.model.Curso;
import projeto.model.Produto;

public class Menu {

	private static final Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Curso c1 = new Curso(1, "Curso Java", 199.99, 0, 0, "Curso completo de Java", "Programação", 300);
		
		// Testes
		c1.visualizar();
		c1.setNome("Curso Java Avançado");
		c1.setPreco(299.99);
		c1.setVagas(30);
		c1.setQuantidadeTurmas(1);
		c1.setCategoria("Programação Orientada a Objeto");
		c1.setDescricao("Curso completo de Java com foco em mercado de trabalho.");
		c1.setCargaHoraria(400);
		c1.visualizar();

		int opcao;

		while (true) {
			// Exibe o menu Generation Java01 E-Commerce
			System.out.println("*=*=*=*=*=*=====================================*=*=*=*=*=*=*");
			System.out.println("*=*=*=*=*=*| Menu Generation Java01 E-Commerce |*=*=*=*=*=*=*");
			System.out.println("*=*=*=*=*=*=====================================*=*=*=*=*=*=*");
			System.out.println("*		  1. Cadastrar Curso		 	   *");
			System.out.println("*		  2. Listar Cursos			   *");
			System.out.println("*		  3. Atualizar Curso			   *");
			System.out.println("*		  4. Excluir Curso			   *");
			System.out.println("*		  0. Sair				   *");
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.print("Escolha uma opção: \n");
			opcao = leia.nextInt();

			// Processa a opção escolhida
			switch (opcao) {
			case 1:
				System.out.println("Opção 1 selecionada: Cadastrar Curso");
				// Lógica para cadastrar curso
				break;
			case 2:
				System.out.println("Opção 2 selecionada: Listar Cursos");
				// Lógica para listar cursos
				break;
			case 3:
				System.out.println("Opção 3 selecionada: Atualizar Curso");
				// Lógica para atualizar curso
				break;
			case 4:
				System.out.println("Opção 4 selecionada: Excluir Curso");
				// Lógica para excluir curso
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
}
