package br.com.crud;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteCRUD {
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao;

		do {
			System.out.println("\n--- Menu ---");
			System.out.println("1. Cadastrar Cliente");
			System.out.println("2. Listar Clientes");
			System.out.println("3. Atualizar Cliente");
			System.out.println("4. Remover Cliente");
			System.out.println("5. Buscar Cliente");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer

			switch (opcao) {
			case 1:
				cadastrarCliente();
				break;
			case 2:
				listarClientes();
				break;
			case 3:
				atualizarCliente();
				break;
			case 4:
				removerCliente();
				break;
			case 5:
				buscarCliente();
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 0);

		scanner.close();
	}

	private static void cadastrarCliente() {
		System.out.print("ID: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Limpar o buffer
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Email: ");
		String email = scanner.nextLine();
		System.out.print("Telefone: ");
		String telefone = scanner.nextLine();

		Cliente cliente = new Cliente(id, nome, email, telefone);
		clientes.add(cliente);
		System.out.println("Cliente cadastrado com sucesso!");
	}

	private static void listarClientes() {
		System.out.println("\n--- Lista de Clientes ---");
		if (clientes.isEmpty()) {
			System.out.println("Nenhum cliente cadastrado.");
		} else {
			for (Cliente cliente : clientes) {
				System.out.println(cliente);
			}
		}
	}

	private static void atualizarCliente() {
		System.out.print("Informe o ID do cliente a ser atualizado: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Limpar o buffer

		Cliente cliente = buscarClientePorId(id);
		if (cliente != null) {
			System.out.print("Novo Nome: ");
			cliente.setNome(scanner.nextLine());
			System.out.print("Novo Email: ");
			cliente.setEmail(scanner.nextLine());
			System.out.print("Novo Telefone: ");
			cliente.setTelefone(scanner.nextLine());
			System.out.println("Dados do cliente atualizados com sucesso!");
		} else {
			System.out.println("Cliente com ID " + id + " não encontrado.");
		}
	}

	private static void removerCliente() {
		System.out.print("Informe o ID do cliente a ser removido: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Limpar o buffer

		Cliente cliente = buscarClientePorId(id);
		if (cliente != null) {
			clientes.remove(cliente);
			System.out.println("Cliente removido com sucesso!");
		} else {
			System.out.println("Cliente com ID " + id + " não encontrado.");
		}
	}

	private static void buscarCliente() {
		System.out.print("Informe o ID do cliente a ser buscado: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Limpar o buffer

		Cliente cliente = buscarClientePorId(id);
		if (cliente != null) {
			System.out.println("\n--- Dados do Cliente ---");
			System.out.println(cliente);
		} else {
			System.out.println("Cliente com ID " + id + " não encontrado.");
		}
	}

	private static Cliente buscarClientePorId(int id) {
		for (Cliente cliente : clientes) {
			if (cliente.getId() == id) {
				return cliente;
			}
		}
		return null;
	}
}
