package br.com.crud;

public class Cliente {
    private static int contadorIds = 1;  // Contador de IDs, inicia com 1
    private int id;
    private String nome;
    private String email;
    private String telefone;

    // Construtor, mas sem passar ID, o ID será atribuído automaticamente
    public Cliente(String nome, String email, String telefone) {
        this.id = contadorIds++;  // Atribui o ID e incrementa o contador
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
