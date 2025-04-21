import java.util.List;

/**
 * Classe principal da aplicação de cadastro.
 * Responsável por iniciar a conexão com o banco de dados e realizar operações
 * como salvar, alterar, listar, buscar e excluir registros.
 */
public class CadastroApp {
    public static void main(String[] args) {
        // Estabelece a conexão com o banco de dados PostgreSQL
        JDBCPostgresql.conectar();

        // Cria uma instância do repositório de cadastros
        CadastroRepository repository = new CadastroRepository();

        // Cria um novo modelo de cadastro e define seus atributos
        CadastroModel novoCcadastro = new CadastroModel();
        novoCcadastro.setNome("Mateus Lima 5");
        novoCcadastro.setIdade(5);

        // --- Operações de CRUD (descomentando conforme a necessidade) ---

        // SALVAR: Para salvar um novo cadastro no banco de dados
        // repository.salvar(novoCcadastro);

        // ALTERAR: Para alterar um cadastro existente (é necessário definir o ID)
        // novoCcadastro.setId(1); // Define o ID do cadastro a ser alterado
        // repository.alterar(novoCcadastro);

        // BUSCAR POR ID: Recupera um cadastro específico pelo ID
        // var cadastro = repository.buscarPorId(1);
        // if(cadastro != null){
        //     System.out.println("Cadastro : " + "\n id: " + cadastro.getId() + " nome:" + cadastro.getNome());
        // }

        // LISTAR: Lista todos os cadastros do banco de dados
        // List<CadastroModel> cadastros = repository.listar();
        // for(CadastroModel c : cadastros){
        //     System.out.println("id: " + c.getId() + " Nome: " + c.getNome() + " Idade: " + c.getIdade() + "\n");
        // }

        // EXCLUIR: Exclui um cadastro pelo ID
        // var excluir = repository.excluir(3); // Tenta excluir o cadastro com ID 3
        //if(excluir){
        //   System.out.println("Cadastro excluído com sucesso.");
        //  } else {
        //       System.out.println("Erro ao excluir.");
        //      }
    }
}
