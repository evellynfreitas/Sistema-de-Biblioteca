package Biblioteca;
import java.util.*;

public class Biblioteca {
	
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();
	private Scanner teclado = new Scanner(System.in);
	
	public Biblioteca() {
	}
	
	public void primeiroMenu() {
		
		int escolha;
		
		do {
			System.out.println("|   Sistema de Biblioteca   |");
			System.out.println("|                           |");
			System.out.println("|   1. Menu de Livros       |");
			System.out.println("|   2. Menu de Clientes     |");
			System.out.println("|   3. Menu de Alugueis     |");
			System.out.println("|   4. Sair                 |");
			System.out.println("|                           |");
			  System.out.print("|   Digite sua escolha: ");

			escolha = teclado.nextInt();
			
			switch(escolha) {
			case 1: menuLivros(); break;
			case 2: menuClientes(); break;
			case 3: menuAlugueis(); break;
			}
		} while(escolha != 4);
	}
	
	public void menuLivros() {
		int escolha;
		do {
			System.out.println();
			System.out.println("|   Menu de Livros          |");
			System.out.println("|                           |");
			System.out.println("|   1. Adicionar Livro      |");
			System.out.println("|   2. Remover Livro        |");
			System.out.println("|   3. Listar Livros        |");
			System.out.println("|   4. Voltar               |");
			System.out.println("|                           |");
			  System.out.print("|   Digite sua escolha: ");
			escolha = teclado.nextInt();
			
			switch(escolha) {
			case 1: novoLivro(); break;
			case 3: listarLivros(); break;
			}
		}while(escolha!=4);
		
	}
	
	public void menuClientes() {
		int escolha;
		do {
			
			System.out.println("\n|   Menu de Clientes        |");
			System.out.println("|                           |");
			System.out.println("|   1. Adicionar Cliente    |");
			System.out.println("|   2. Remover Cliente      |");
			System.out.println("|   3. Listar Clientes      |");
			System.out.println("|   4. Voltar               |");
			System.out.println("|                           |");
			  System.out.print("|   Digite sua escolha: ");
			escolha = teclado.nextInt();
			
			switch(escolha) {
			case 1: novoCliente(); break;
			case 3: listarClientes(); break;
			}
			
		}while(escolha!=4);
	}

	public void menuAlugueis() {
		
	}
 
	public void novoCliente() {
		teclado.nextLine();
		System.out.print("\nDigite seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("\nDigite seu CPF: ");
		String cpf = teclado.nextLine();
		
		System.out.print("\nDigite seu email: ");
		String email = teclado.nextLine();
		
		clientes.add(new Cliente(cpf,nome,email));
	}
	
	public void novoLivro() {
		int codigo = livros.size();
		teclado.nextLine();
		System.out.print("\nDigite o título do livro: ");
		String titulo = teclado.nextLine();
		
		System.out.print("Digite o autor do livro: ");
		String autor = teclado.nextLine();
		
		livros.add(new Livro(codigo,titulo,autor));
	}

	public void novoAluguel() {
		Cliente cliente=null;
		Livro livro=null;
		int codigoAluguel = alugueis.size();
		
		System.out.print("\nDigite o código do livro: ");
		int codLivro = teclado.nextInt();
		System.out.print("\nDigite o CPF do cliente: ");
		String codCliente = teclado.nextLine();
		
		for(Cliente c : clientes) {
			if(codCliente == c.getCpf()) {
				cliente = c;
				break;
			}
		}
		
		for(Livro l : livros) {
			if(codLivro == l.getCodigo()) {
				livro = l;
				break;
			}
		}
		
		alugueis.add(new Aluguel(codigoAluguel, cliente, livro));

	}

	public void listarLivros() {

		System.out.println("\n|Codigo		Titulo			Autor");
		
		for(Livro l : livros)
			System.out.printf("|%d		%s		%s\n",l.getCodigo(), l.getTitulo(), l.getAutor());
		
	}
	
	public void listarClientes() {

		System.out.println("\n|CPF		Nome Completo:");
		
		for(Cliente c : clientes)
			System.out.printf("|%d		%s\n",c.getCpf(), c.getNome());
		
	}
	
}
