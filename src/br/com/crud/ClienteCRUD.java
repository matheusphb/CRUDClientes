package br.com.crud;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteCRUD {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            opcao = solicitarOpcaoMenu();
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

    private static int solicitarOpcaoMenu() {
        int opcao = -1;
        while (opcao < 0 || opcao > 5) {
            try {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Cadastrar Cliente");
                System.out.println("2. Listar Clientes");
                System.out.println("3. Atualizar Cliente");
                System.out.println("4. Remover Cliente");
                System.out.println("5. Buscar Cliente");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = Integer.parseInt(scanner.nextLine());
                if (opcao < 0 || opcao > 5) {
                    System.out.println("Opção inválida! Digite um número entre 0 e 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número entre 0 e 5.");
            }
        }
        return opcao;
    }

    private static int solicitarId(String mensagem) {
        int id = -1;
        while (id < 0) {
            try {
                System.out.print(mensagem);
                id = Integer.parseInt(scanner.nextLine());
                if (id < 0) {
                    System.out.println("O ID deve ser um número positivo. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número válido.");
            }
        }
        return id;
    }

    private static void cadastrarCliente() {
        System.out.println("\n--- Cadastrar Cliente ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        clientes.add(new Cliente(nome, email, telefone));
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void listarClientes() {
        System.out.println("\n--- Lista de Clientes ---");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println("--- Dados do Cliente ---");
                System.out.println("ID: " + cliente.getId());
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("E-mail: " + cliente.getEmail());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println("------------------------");
            }
        }
    }

    private static void atualizarCliente() {
        int id = solicitarId("Informe o ID do cliente a ser atualizado: ");

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
        int id = solicitarId("Informe o ID do cliente a ser removido: ");

        Cliente cliente = buscarClientePorId(id);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente com ID " + id + " não encontrado.");
        }
    }

    private static void buscarCliente() {
        int id = solicitarId("Digite o ID do cliente que deseja buscar: ");

        Cliente cliente = buscarClientePorId(id);
        if (cliente != null) {
            System.out.println("\n--- Cliente Encontrado ---");
            System.out.println("ID: " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("E-mail: " + cliente.getEmail());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("--------------------------");
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
