package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Ingrediente;
import modelo.UnidadeMedida;

public class IngredienteDao {
    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;
    private ArrayList<Ingrediente> lista;












    public void add(Ingrediente ingrediente) {
        String sql = "INSERT INTO ingrediente " +
        "(ingredienteNome, unidadeMedida, quantidadeEmbalagem, preço) " + 
        " VALUES (?, ?, ?, ?);";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, ingrediente.getIngredienteNome());
            stmt.setString(2,ingrediente.getUnidadeMedida().getUnidade());
            stmt.setDouble(3,ingrediente.getQuantidadeEmbalagem());
            stmt.setDouble(4,ingrediente.getPreco());
            stmt.execute();
            stmt.close();

        } catch (SQLException exception) {
            
            JOptionPane.showMessageDialog(null, exception);
        }finally{

            try{
                // Verifica se o Statement está fechado se não tiver ele o fecha
                if(stmt!=null){
                    stmt.close();
                }
                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if(conexao!=null){
                    conexao.close();
                }
            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
    }
       
    



    public ArrayList<Ingrediente> getIngredientes() {
        String sql = "SELECT * FROM ingrediente";
        try {
            this.conexao = new Conection().getConnection();

            stmt = conexao.prepareStatement(sql);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Ingrediente objIngrediente = new Ingrediente();
                objIngrediente.setId(rs.getInt("id"));
                objIngrediente.setIngredienteNome(rs.getString("ingredienteNome"));
                objIngrediente.setQuantidadeEmbalagem(rs.getDouble("quantidadeEmbalagem"));
                objIngrediente.setPreco(rs.getDouble("preço"));
                if (rs.getString("unidadeMedidaRendimento").equals("g")) {
                    UnidadeMedida unidadeMedida = UnidadeMedida.GRAMAS;
                    objIngrediente.setUnidadeMedida(unidadeMedida);
                    this.lista.add(objIngrediente);
                } else if  (rs.getString("unidadeMedidaRendimento").equals("unidade")) {
                    UnidadeMedida unidadeMedida = UnidadeMedida.UNIDADE;
                    objIngrediente.setUnidadeMedida(unidadeMedida);
                    this.lista.add(objIngrediente);
                } else {
                    UnidadeMedida unidadeMedida = UnidadeMedida.MILILITROS;
                    objIngrediente.setUnidadeMedida(unidadeMedida);
                    this.lista.add(objIngrediente);
                }
                
                
            }
            
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }finally{

            try{


                // Verifica se o Statement está fechado se não tiver ele o fecha
                if(stmt!=null){
                    stmt.close();
                }


                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if(conexao!=null){
                    conexao.close();
                }


            }catch(SQLException e){
                    e.printStackTrace();
            }
        }

        return this.lista;
    }
  







    public void dell(Ingrediente ingrediente) {

        
        // Cria uma instâcia temporaria de Aluno_AtividadeDao para deletar todas as tuplas dessa tabela que esse aluno é referenciado
        new Receita_ingredienteDao().dellIngrediente(ingrediente);


        // Cria a string que sera executado no banco de dados
        String sql= "DELETE FROM ingrediente WHERE id = ?";


        // Conecta com o banco de dados
        conexao = new Conection().getConnection();
        try {


            // Prepara o Statement que vai ser executada
            stmt = conexao.prepareStatement(sql);


            // Informa que aonde está o ponto de interrogação é para substituir pelo idAluno
            stmt.setInt(1, ingrediente.getId());


            // Executa e fecha o Statement
            stmt.execute();
            stmt.close();
            

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{

            try{


                // Verifica se o Statement está fechado se não tiver ele o fecha
                if(stmt!=null){
                    stmt.close();
                }


                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if(conexao!=null){
                    conexao.close();
                }


            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
        
    }


    public void update(Ingrediente ingrediente) {
        String sql = "update ingrediente set" +
                "`ingredienteNome` = ?,\n" +
                "`quantidadeEmbalagem` = ?,\n" +
                "`unidadeMedida` = ?\n" +
                "`preço` = ?\n" +
        "WHERE `id` = ?;\n";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, ingrediente.getIngredienteNome());
            stmt.setDouble(2, ingrediente.getQuantidadeEmbalagem());
            stmt.setString(3, ingrediente.getUnidadeMedida().getUnidade());
            stmt.setDouble(4, ingrediente.getPreco());
            stmt.setInt(5, ingrediente.getId());
            stmt.execute();
            stmt.close();

         } catch (SQLException exception) {
            // TODO: handle exception
            
            JOptionPane.showMessageDialog(null, "Inválido. Tente novamente.");
        }
    }

}
