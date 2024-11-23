```markdown
# Projeto CRUD de Clientes em Java

Este é um projeto simples em Java para realizar operações CRUD (Criar, Ler, Atualizar, Deletar) de clientes utilizando a estrutura de dados `ArrayList`. O projeto permite cadastrar, listar, atualizar, remover e buscar clientes, proporcionando uma interface de usuário básica no console.

## Funcionalidades

- **Cadastrar Cliente**: Permite adicionar um novo cliente ao sistema.
- **Listar Clientes**: Exibe todos os clientes cadastrados.
- **Atualizar Cliente**: Permite atualizar as informações de um cliente existente.
- **Remover Cliente**: Remove um cliente com base no seu ID.
- **Buscar Cliente**: Pesquisa um cliente pelo seu ID e exibe os dados.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação para implementar as funcionalidades.
- **ArrayList**: Estrutura de dados utilizada para armazenar os clientes em memória.
- **Scanner**: Usado para capturar entradas do usuário no console.

## Pré-Requisitos

- **Java 8 ou superior** instalado no seu computador.

## Como Executar o Projeto

### Passo 1: Baixar o Projeto

1. Clone este repositório ou faça o download do código.
   ```bash
   git clone https://github.com/matheusphb/CRUDClientes.git
   ```

### Passo 2: Abrir o Projeto

1. Abra o projeto na sua IDE favorita (Eclipse, IntelliJ IDEA, NetBeans).
2. No Eclipse, vá em **File > Open Projects from File System** e selecione o diretório do projeto.

### Passo 3: Executar o Projeto

1. Clique com o botão direito na classe `ClienteCRUD` e selecione **Run As > Java Application**.
2. O menu do CRUD será exibido no console.

## Estrutura do Projeto

O projeto contém as seguintes classes:

### `Cliente.java`

Classe que representa o modelo de cliente. Contém os atributos `id`, `nome`, `email` e `telefone`, juntamente com os métodos getters e setters, e um método `toString` para exibição formatada dos dados do cliente.

### `ClienteCRUD.java`

Classe principal que implementa o menu do CRUD e contém as operações para:
- Cadastrar cliente
- Listar clientes
- Atualizar cliente
- Remover cliente
- Buscar cliente por ID

## Exemplo de Uso

### Menu do CRUD
Ao executar o programa, o menu será exibido no console:

```
--- Menu ---
1. Cadastrar Cliente
2. Listar Clientes
3. Atualizar Cliente
4. Remover Cliente
5. Buscar Cliente
0. Sair
Escolha uma opção:
```

- Para cadastrar um cliente, escolha a opção 1 e insira os dados solicitados.
- Para listar os clientes cadastrados, escolha a opção 2.
- Para atualizar um cliente, escolha a opção 3 e forneça o ID do cliente.
- Para remover um cliente, escolha a opção 4 e forneça o ID do cliente.
- Para buscar um cliente, escolha a opção 5 e forneça o ID do cliente.

## Exemplo de Captura de Tela

### Cadastro de Cliente

```
ID: 1
Nome: João da Silva
Email: joao@exemplo.com
Telefone: 123456789
Cliente cadastrado com sucesso!
```

### Listagem de Clientes

```
--- Lista de Clientes ---
ID: 1, Nome: João da Silva, Email: joao@exemplo.com, Telefone: 123456789
```

## Melhorias Futuras

- **Persistência de Dados**: Implementar a persistência dos dados em um arquivo ou banco de dados para que as informações não sejam perdidas ao encerrar o programa.
- **Validação de Entrada**: Adicionar validações para garantir que os dados inseridos pelo usuário sejam válidos (ex: formato correto de e-mail, número de telefone válido).
- **Interface Gráfica**: Desenvolver uma interface gráfica para tornar a interação com o usuário mais amigável.

---

Feito por [Matheus](https://github.com/matheusphb)
