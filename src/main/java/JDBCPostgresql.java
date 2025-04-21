import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public  class JDBCPostgresql {
    private static Connection conexao;

    public static Connection getConexao() {
        return conexao;
    }

    public  static  void conectar(){
        try {
            if(conexao == null){
                String url = "jdbc:postgresql://localhost/escola";
                Properties props = new Properties();
                props.setProperty("user", "postgres");
                props.setProperty("password", "root");
                // props.setProperty("ssl", "true");
                conexao = DriverManager.getConnection(url, props);
                System.out.println("Instacia realizada com sucesso");
            }



        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
