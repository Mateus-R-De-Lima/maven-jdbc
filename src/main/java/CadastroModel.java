public class CadastroModel {
    public void setId(Integer id) {
        this.id = id;
    }

    private  Integer id;
    private  String nome;
    private  Integer idade;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
