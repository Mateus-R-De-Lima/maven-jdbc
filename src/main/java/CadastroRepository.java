import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CadastroRepository {

    private Connection conexao;

    public  CadastroRepository(){
        conexao = JDBCPostgresql.getConexao();


    }

    public void salvar(CadastroModel cadastro){
            try {
                String instrucaoSql = "INSERT INTO tb_alunos.tb_cadastros (nome,idade) VALUES(?,?);";
                PreparedStatement pst = conexao.prepareStatement(instrucaoSql);
                pst.setString(1,cadastro.getNome());
                pst.setInt(2,cadastro.getIdade());
                pst.execute();

                System.out.println("Cadastros feito com sucesso!");
            }catch (Exception ex){
                ex.printStackTrace();
            }
    }
    public void alterar(CadastroModel cadastro){
        try {
            String instrucaoSql = "UPDATE tb_alunos.tb_cadastros SET nome = ?, idade = ? WHERE id = ?";
            PreparedStatement pst = conexao.prepareStatement(instrucaoSql);
            pst.setString(1, cadastro.getNome());
            pst.setInt(2, cadastro.getIdade());
            pst.setInt(3, cadastro.getId());
            pst.execute();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public boolean excluir(Integer id){
        try {
            String instrucaoSql = "DELETE FROM tb_alunos.tb_cadastros WHERE id = ?";
            PreparedStatement pst = conexao.prepareStatement(instrucaoSql);
            pst.setInt(1, id);
            pst.execute();
            return  true;

        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }

    }
    public List<CadastroModel> listar(){
        List<CadastroModel> listaDeCadastros = new ArrayList<>();

        try {

            String instrucaoSql = "SELECT * FROM tb_alunos.tb_cadastros order by id desc";
            PreparedStatement pst = conexao.prepareStatement(instrucaoSql);
            ResultSet result = pst.executeQuery();

            while (result.next()) {
                Integer id = result.getInt("id");
                String nome = result.getString("nome");
                Integer idade = result.getInt("idade");

                CadastroModel cadastro = new CadastroModel();
                cadastro.setId(id);
                cadastro.setNome(nome);
                cadastro.setIdade(idade);

                listaDeCadastros.add(cadastro);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return listaDeCadastros;
    }
    public CadastroModel buscarPorId(Integer id){
        CadastroModel cadastro = new CadastroModel();
       try {
           String instrucaoSql = "SELECT * FROM tb_alunos.tb_cadastros WHERE id = ?";
           PreparedStatement pst = conexao.prepareStatement(instrucaoSql);
           pst.setInt(1, id);
           ResultSet result = pst.executeQuery();
           if(result.next()){
                cadastro.setId(result.getInt("id"));
                cadastro.setNome(result.getString("nome"));
                cadastro.setIdade(result.getInt("idade"));
           }



       }catch (Exception ex){
           ex.printStackTrace();
       }

        return cadastro;
    }
}
